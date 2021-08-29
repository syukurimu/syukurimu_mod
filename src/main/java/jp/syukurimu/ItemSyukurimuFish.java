package jp.syukurimu;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemSyukurimuFish extends ItemFood {
    public ItemSyukurimuFish() {
        super(20, 20, false);
        setTranslationKey("syukurimu_fish");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_fish"));
        setAlwaysEdible();
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        PotionEffect effect = new PotionEffect(Potion.getPotionById(26), 5000, 255);
        PotionEffect effect2 = new PotionEffect(Potion.getPotionById(13), 5000, 255);
        player.addPotionEffect(effect);
        player.addPotionEffect(effect2);
    }

}



