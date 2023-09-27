package destiny.urbanwarfare;

import destiny.urbanwarfare.client.ClientHandler;
import destiny.urbanwarfare.registry.ItemRegistry;
import destiny.urbanwarfare.registry.SoundRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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
    }
}