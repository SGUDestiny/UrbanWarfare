package destiny.urbanwarfare.common;

import com.mrcrayfish.guns.common.AmmoContext;
import com.mrcrayfish.guns.common.Gun;
import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class UrbanCustomGun {

    private final int startTick;
    private final int slot;
    private final ItemStack stack;
    private final Gun gun;
    private UrbanCustomGun(PlayerEntity player)
    {
        this.startTick = player.tickCount;
        this.slot = player.inventory.selected;
        this.stack = player.inventory.getSelected();
        this.gun = ((GunItem) stack.getItem()).getModifiedGun(stack);
    }
    public void crossbowReload(PlayerEntity player) {
        AmmoContext context = Gun.findAmmo(player, this.gun.getProjectile().getItem());
        ItemStack ammo = ((AmmoContext) context).getStack();
        if (!ammo.isEmpty()) {
            int amount = Math.min(ammo.getCount(), this.gun.getGeneral().getReloadAmount());
            CompoundNBT tag = this.stack.getTag();
        }
    }
}
