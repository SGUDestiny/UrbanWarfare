package destiny.urbanwarfare.common;

import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.interfaces.IGunModifier;
import net.minecraft.util.math.MathHelper;

public class UrbanGunModifiers extends GunModifiers {

        public static final IGunModifier SPAS12_STOCK_MODIFIER = new IGunModifier() {
            @Override
            public float recoilModifier() {
                return 0.3F;
            }

            @Override
            public float kickModifier() {
                return 0.3F;
            }
        };
    }

