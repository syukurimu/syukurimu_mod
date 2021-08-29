package jp.syukurimu;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemSyukurimuEnchant extends ItemFood {
    public ItemSyukurimuEnchant() {
        super(20, 20, false);
        setTranslationKey("syukurimu_enchant");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_enchant"));
        setAlwaysEdible();
    }

    @Override
    public boolean hasEffect(ItemStack Stack){
        return true;
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        PotionEffect effect1 = new PotionEffect(Potion.getPotionById(10), 5000, 255);
        PotionEffect effect2 = new PotionEffect(Potion.getPotionById(8),5000,15);
        PotionEffect effect3 = new PotionEffect(Potion.getPotionById(1),5000,15);
        PotionEffect effect4 = new PotionEffect(Potion.getPotionById(11),5000,255);
        PotionEffect effect5 = new PotionEffect(Potion.getPotionById(5),5000,255);
        PotionEffect effect6 = new PotionEffect(Potion.getPotionById(13),5000,255);
        PotionEffect effect7 = new PotionEffect(Potion.getPotionById(21), 5000, 255);
        PotionEffect effect8 = new PotionEffect(Potion.getPotionById(16),5000,255);
        PotionEffect effect9 = new PotionEffect(Potion.getPotionById(22),5000,255);
        PotionEffect effect10 = new PotionEffect(Potion.getPotionById(3),5000,255);
        player.addPotionEffect(effect1);
        player.addPotionEffect(effect2);
        player.addPotionEffect(effect3);
        player.addPotionEffect(effect4);
        player.addPotionEffect(effect5);
        player.addPotionEffect(effect6);
        player.addPotionEffect(effect7);
        player.addPotionEffect(effect8);
        player.addPotionEffect(effect9);
        player.addPotionEffect(effect10);
    }

}

    class ItemEffect extends Item
    {
    public ItemEffect(ItemStack hasEffect){
        super.hasEffect(hasEffect);
    }

    @Override
     public boolean hasEffect(ItemStack syukurimu_enchant) {
        return syukurimu_enchant.isItemEnchanted();
    }
}


