package destiny.urbanwarfare.common;

import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.Properties;
public class UrbanGunItem extends GunItem {

    private final boolean canColor;

    /**
     * @param properties The item properties
     * @param canColor If the gun can be colored or not
     */
    public UrbanGunItem(Properties properties, boolean canColor) {
        super(properties);
        this.canColor = canColor;
    }

    @Override
    public boolean canColor(ItemStack stack) {
        return this.canColor;
    }
}