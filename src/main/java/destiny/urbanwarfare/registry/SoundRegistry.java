package destiny.urbanwarfare.registry;

import destiny.urbanwarfare.UrbanWarfare;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundRegistry {
    // Deferred Register for sound registration.
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UrbanWarfare.ID);

    /* Sounds */
    public static final RegistryObject<SoundEvent> SPAS12_FIRE = register("item.spas12.fire");

    public static final RegistryObject<SoundEvent> KRISS_VECTOR_FIRE = register("item.kriss_vector.fire");

    public static final RegistryObject<SoundEvent> GLOCK19_FIRE = register("item.glock19.fire");

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(UrbanWarfare.ID, name)));
    }
}