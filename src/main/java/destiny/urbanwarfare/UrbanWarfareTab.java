package destiny.urbanwarfare;

import destiny.urbanwarfare.common.UrbanGunItem;
import com.mrcrayfish.guns.client.CustomGunManager;
import destiny.urbanwarfare.registry.ItemRegistry;
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
        return new ItemStack(ItemRegistry.KRISS_VECTOR.get());
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
        CustomGunManager.fill(items);
    }
}