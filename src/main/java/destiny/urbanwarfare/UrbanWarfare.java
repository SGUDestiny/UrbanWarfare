package destiny.urbanwarfare;



import destiny.urbanwarfare.client.ClientHandler;
import destiny.urbanwarfare.datagen.ModRecipeGenerator;
import destiny.urbanwarfare.registry.ItemRegistry;
import destiny.urbanwarfare.registry.SoundRegistry;
import destiny.urbanwarfare.UrbanWarfareTab;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.stream.Collectors;

@Mod(UrbanWarfare.ID)
public class UrbanWarfare {
    public static final String ID = "urbanwarfare";
    public static final ItemGroup GROUP = new UrbanWarfareTab(ID);

    public UrbanWarfare() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        ItemRegistry.ITEMS.register(bus);
        SoundRegistry.SOUNDS.register(bus);

        bus.addListener(this::clientSetup);
        bus.addListener(this::gatherData);
    }

    void clientSetup(FMLClientSetupEvent event) {
        ClientHandler.registerModelOverrides();
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new ModRecipeGenerator(generator));
    }
}