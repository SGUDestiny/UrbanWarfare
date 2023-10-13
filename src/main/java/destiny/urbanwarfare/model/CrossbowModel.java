package destiny.urbanwarfare.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import destiny.urbanwarfare.client.SpecialModels;
import destiny.urbanwarfare.client.render.gun.IOverrideModel;
import com.mrcrayfish.guns.client.util.RenderUtil;
import com.mrcrayfish.guns.common.Gun;
import com.mrcrayfish.guns.init.ModSyncedDataKeys;
import com.mrcrayfish.obfuscate.common.data.SyncedPlayerData;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.WeakHashMap;

/**
 * Author: MrCrayfish
 */
public class CrossbowModel implements IOverrideModel
{
    @Override
    public void tick(PlayerEntity entity)
    {
        boolean hasAmmo = SyncedPlayerData.instance().get(entity, ModSyncedDataKeys.SHOOTING);
        ItemStack heldItem = entity.getMainHandItem();
        if(!Gun.hasAmmo(heldItem))
        {
            hasAmmo = false;
        }

        if(hasAmmo)
        {
        }
        else
        {
        }
    }

    @Override
    public void render(float partialTicks, ItemCameraTransforms.TransformType transformType, ItemStack stack, ItemStack parent, LivingEntity entity, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light, int overlay)
    {
        Minecraft.getInstance().getItemRenderer().render(stack, ItemCameraTransforms.TransformType.NONE, false, matrixStack, renderTypeBuffer, light, overlay, SpecialModels.CROSSBOW_BASE.getModel());
        Minecraft.getInstance().getItemRenderer().render(stack, ItemCameraTransforms.TransformType.NONE, false, matrixStack, renderTypeBuffer, light, overlay, SpecialModels.CROSSBOW_BOLT.getModel());
        Minecraft.getInstance().getItemRenderer().render(stack, ItemCameraTransforms.TransformType.NONE, false, matrixStack, renderTypeBuffer, light, overlay, SpecialModels.CROSSBOW_STRING_RELEASED.getModel());
        Minecraft.getInstance().getItemRenderer().render(stack, ItemCameraTransforms.TransformType.NONE, false, matrixStack, renderTypeBuffer, light, overlay, SpecialModels.CROSSBOW_STRING_TAUT.getModel());
    }
}
