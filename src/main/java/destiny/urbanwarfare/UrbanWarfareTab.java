package destiny.urbanwarfare;

import destiny.urbanwarfare.common.UrbanGunItem;
import destiny.urbanwarfare.registry.ItemRegistry;
import com.mrcrayfish.guns.client.CustomGunManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class UrbanWarfareTab extends ItemGroup {
    public UrbanWarfareTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        UrbanGunItem gunItem = (UrbanGunItem) ItemRegistry.KRISS_VECTOR.get();
        ItemStack stack = gunItem.getDefaultInstance();
        stack.getOrCreateTag().putInt("AmmoCount", gunItem.getGun().getGeneral().getMaxAmmo());
        return stack;
    }
    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
        CustomGunManager.fill(items);
    }
}