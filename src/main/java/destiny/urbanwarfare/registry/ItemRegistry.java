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
import destiny.urbanwarfare.common.UrbanGunModifiers;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.interfaces.IGunModifier;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UrbanWarfare.ID);
    public static final Item.Properties genericProperties = new Item.Properties().stacksTo(1).tab(UrbanWarfare.GROUP);



    /* Weapons */
    public static final RegistryObject<Item> SPAS12 = registerGun("spas12", false);

    public static final RegistryObject<Item> KRISS_VECTOR = registerGun("kriss_vector", false);

    public static final RegistryObject<Item> BARRETT_M82A1 = registerGun("barrett_m82a1", false);

    public static final RegistryObject<Item> GLOCK19 = registerGun("glock19", false);

    public static final RegistryObject<Item> COLT_KING_COBRA = registerGun("colt_king_cobra", false);

    public static final RegistryObject<Item> CROSSBOW = registerGun("crossbow", false);

    /* Sights & Scopes */
    public static final RegistryObject<Item> BARRETT_SCOPE = ITEMS.register("barrett_scope", () -> new ScopeItem(Scope.create(0.3F, 2.20F, UrbanGunModifiers.BARRETT_SCOPE_MODIFIER).viewFinderOffset(0.5), genericProperties, false));
    public static final RegistryObject<Item> EOTECH_SIGHT = ITEMS.register("eotech_sight", () -> new ScopeItem(Scope.create(0.1F, 1.5F, UrbanGunModifiers.EOTECH_SIGHT_MODIFIER).viewFinderOffset(0.4), genericProperties, false));

    /* Stocks */
    public static final RegistryObject<Item> SPAS12_STOCK = ITEMS.register("spas12_stock", () -> new StockItem(Stock.create(UrbanGunModifiers.SPAS12_STOCK_MODIFIER), genericProperties, false));

    public static final RegistryObject<Item> KRISS_VECTOR_STOCK = ITEMS.register("kriss_vector_stock", () -> new StockItem(Stock.create(UrbanGunModifiers.KRISS_VECTOR_STOCK_MODIFIER), genericProperties, false));

    /* Barrels */
    public static final RegistryObject<Item> KRISS_VECTOR_SUPPRESSOR = ITEMS.register("kriss_vector_suppressor", () -> new BarrelItem(Barrel.create(16.0f, UrbanGunModifiers.KRISS_VECTOR_SUPPRESSOR_MODIFIER), genericProperties, false));

    public static final RegistryObject<Item> STANDARD_SUPPRESSOR = ITEMS.register("standard_suppressor", () -> new BarrelItem(Barrel.create(16.0f, UrbanGunModifiers.STANDARD_SUPPRESSOR_MODIFIER), genericProperties, false));

    public static final RegistryObject<Item> MUZZLE_BRAKE = ITEMS.register("muzzle_brake", () -> new BarrelItem(Barrel.create(2.0f, UrbanGunModifiers.MUZZLE_BRAKE_MODIFIER), genericProperties, false));

    public static final RegistryObject<Item> FLASH_HIDER = ITEMS.register("flash_hider", () -> new BarrelItem(Barrel.create(5.0F, UrbanGunModifiers.FLASH_HIDER_MODIFIER), genericProperties, false));

    /* Underbarrels */
    public static final RegistryObject<Item> STANDARD_FOREGRIP = ITEMS.register("standard_foregrip", () -> new UnderBarrelItem(UnderBarrel.create(UrbanGunModifiers.STANDARD_FOREGRIP_MODIFIER), genericProperties, false));

    public static final RegistryObject<Item> BIPOD_FOREGRIP = ITEMS.register("bipod_foregrip", () -> new UnderBarrelItem(UnderBarrel.create(UrbanGunModifiers.BIPOD_FOREGRIP_MODIFIER), genericProperties, false));

    public static final RegistryObject<Item> TAC_SAC = ITEMS.register("tac_sac", () -> new UnderBarrelItem(UnderBarrel.create(UrbanGunModifiers.TAC_SAC_MODIFIER), genericProperties, false));

    /* Ammo */
    public static final RegistryObject<Item> WOODEN_BOLT = registerAmmo("wooden_bolt");

    public static final RegistryObject<Item> NINE_MM_ROUND = registerAmmo("9mm_round");

    public static final RegistryObject<Item> FIFTY_BMG_ROUND = registerAmmo("50_bmg_round");

    public static final RegistryObject<Item> TWELVE_GAUGE_SHELL = registerAmmo("12_gauge_shell");

    public static final RegistryObject<Item> THREEFIVESEVEN_MAGNUM_ROUND = registerAmmo("357_magnum_round");

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