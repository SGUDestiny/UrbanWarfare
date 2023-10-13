package destiny.urbanwarfare.common;

import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.interfaces.IGunModifier;
import net.minecraft.util.math.MathHelper;

public class UrbanGunModifiers extends GunModifiers {

        public static final IGunModifier SPAS12_STOCK_MODIFIER = new IGunModifier() {
            @Override
            public float recoilModifier() {
                return 0.8F;
            }

            @Override
            public float kickModifier() {
                return 0.8F;
            }
            @Override
            public double modifyAimDownSightSpeed(double speed)
            {
                return speed * 0.7F;
            }
        };

        public static final IGunModifier KRISS_VECTOR_STOCK_MODIFIER = new IGunModifier() {
            @Override
            public float recoilModifier() {
                return 0.85F;
            }

            @Override
            public float kickModifier() {
                return 0.75F;
            }

            @Override
            public int modifyFireRate(int rate)
            {
                return MathHelper.clamp((int) (rate * 0.1), rate + 1, Integer.MAX_VALUE);
            }

            @Override
            public double modifyAimDownSightSpeed(double speed)
            {
                return speed * 0.85F;
            }
        };

    public static final IGunModifier EOTECH_SIGHT_MODIFIER = new IGunModifier() {
        @Override
        public double modifyAimDownSightSpeed(double speed)
        {
            return speed * 1.1F;
        }
    };

    public static final IGunModifier BARRETT_SCOPE_MODIFIER = new IGunModifier() {
        @Override
        public double modifyAimDownSightSpeed(double speed)
        {
            return speed * 0.6F;
        }

        @Override
        public float recoilModifier ()
        {
            return 0.8F;
        }
    };

    public static final IGunModifier KRISS_VECTOR_SUPPRESSOR_MODIFIER = new IGunModifier() {
        @Override
        public double modifyAimDownSightSpeed(double speed)
        {
            return speed * 0.9F;
        }

        @Override
        public float recoilModifier() {
            return 0.8F;
        }

        public double modifyProjectileGravity(double gravity)
        {
            return gravity * 0.9;
        }
    };

    public static final IGunModifier STANDARD_FOREGRIP_MODIFIER = new IGunModifier() {
        @Override
        public double modifyAimDownSightSpeed(double speed)
        {
            return speed * 0.8F;
        }

        @Override
        public float kickModifier() {
            return 0.85F;
        }

        @Override
        public float recoilModifier() {
            return 0.9F;
        }
    };

    public static final IGunModifier BIPOD_FOREGRIP_MODIFIER = new IGunModifier() {
        @Override
        public double modifyAimDownSightSpeed(double speed)
        {
            return speed * 0.7F;
        }

        @Override
        public float kickModifier() {
            return 0.8F;
        }

        @Override
        public float recoilModifier() {
            return 0.8F;
        }
    };

    public static final IGunModifier TAC_SAC_MODIFIER = new IGunModifier() {
        @Override
        public double modifyAimDownSightSpeed(double speed)
        {
            return speed * 1.2F;
        }

        @Override
        public float kickModifier() {
            return 1.25F;
        }

        @Override
        public float recoilModifier() {
            return 0.75F;
        }
    };

    public static final IGunModifier MUZZLE_BRAKE_MODIFIER = new IGunModifier() {

        @Override
        public float modifyFireSoundVolume(float volume)
        {
            return volume * 1.2F;
        }

        @Override
        public double modifyFireSoundRadius(double radius)
        {
            return radius * 1.4;
        }
        @Override
        public float kickModifier() {
            return 0.9F;
        }

        @Override
        public float recoilModifier() {
            return 0.85F;
        }

        @Override
        public double modifyMuzzleFlashSize(double size) {
            return size * 2.2F;
        }
    };

    public static final IGunModifier FLASH_HIDER_MODIFIER = new IGunModifier() {

        @Override
        public double modifyMuzzleFlashSize(double size) {
            return size * 0.5F;
        }
    };

    public static final IGunModifier STANDARD_SUPPRESSOR_MODIFIER = new IGunModifier() {

        @Override
        public float modifyFireSoundVolume(float volume)
        {
            return volume * 0.6F;
        }

        @Override
        public double modifyFireSoundRadius(double radius)
        {
            return radius * 0.65;
        }

        public double modifyProjectileGravity(double gravity)
        {
            return gravity * 0.85;
        }

        @Override
        public double modifyMuzzleFlashSize(double size) {
            return size * 0.9F;
        }
    };
    }

