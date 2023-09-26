package destiny.urbanwarfare.registry;

import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.*;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import destiny.urbanwarfare.UrbanWarfare;
import destiny.urbanwarfare.common.UrbanGunItem;
import destiny.urbanwarfare.common.BulletCasingItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UrbanWarfare.ID);
    public static final Item.Properties genericProperties = new Item.Properties().stacksTo(1).tab(UrbanWarfare.GROUP);


    public static final RegistryObject<Item> SPAS12 = registerGun("spas12", false);

    public static final RegistryObject<Item> KRISS_VECTOR = registerGun("kriss_vector", false);

    public static final RegistryObject<Item> GLOCK19 = registerGun("glock19", false);

    private static RegistryObject<Item> registerGun(String name, boolean canColor) {
        return ITEMS.register(name, () -> new UrbanGunItem(genericProperties, canColor));
    }

    private static RegistryObject<Item> registerAmmo(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(UrbanWarfare.GROUP)));
    }

    private static RegistryObject<Item> registerCasing(String name) {
        return ITEMS.register(name, () -> new BulletCasingItem(new Item.Properties().tab(UrbanWarfare.GROUP)));
    }

}