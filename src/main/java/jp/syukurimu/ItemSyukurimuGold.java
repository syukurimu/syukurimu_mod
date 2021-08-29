package jp.syukurimu;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemSyukurimuGold extends ItemFood {
    public ItemSyukurimuGold() {
        super(20, 20, false);
        setTranslationKey("syukurimu_gold");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_gold"));
        setAlwaysEdible();
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        PotionEffect effect1 = new PotionEffect(Potion.getPotionById(10), 5000, 255);
        PotionEffect effect2 = new PotionEffect(Potion.getPotionById(8),5000,15);
        PotionEffect effect3 = new PotionEffect(Potion.getPotionById(1),5000,15);
        PotionEffect effect4 = new PotionEffect(Potion.getPotionById(11),5000,255);
        PotionEffect effect5 = new PotionEffect(Potion.getPotionById(5),5000,255);
        PotionEffect effect6 = new PotionEffect(Potion.getPotionById(13),5000,255);
        player.addPotionEffect(effect1);
        player.addPotionEffect(effect2);
        player.addPotionEffect(effect3);
        player.addPotionEffect(effect4);
        player.addPotionEffect(effect5);
        player.addPotionEffect(effect6);
    }

}



