package jp.syukurimu;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemSyukurimuHot extends ItemFood {
    public ItemSyukurimuHot() {
        super(20, 20, false);
        setTranslationKey("syukurimu_hot");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_hot"));
        setAlwaysEdible();
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        PotionEffect effect = new PotionEffect(Potion.getPotionById(12), 5000, 255);
        player.addPotionEffect(effect);
    }

}



