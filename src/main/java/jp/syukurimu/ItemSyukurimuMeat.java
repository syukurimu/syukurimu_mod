package jp.syukurimu;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemSyukurimuMeat extends ItemFood {
    public ItemSyukurimuMeat() {
        super(20, 20, false);
        setTranslationKey("syukurimu_meat");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_meat"));
        setAlwaysEdible();
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        PotionEffect effect = new PotionEffect(Potion.getPotionById(23), 5000, 255);
        player.addPotionEffect(effect);
    }

}



