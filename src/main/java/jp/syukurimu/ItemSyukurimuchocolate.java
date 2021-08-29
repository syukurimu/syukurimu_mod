package jp.syukurimu;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemSyukurimuChocolate extends ItemFood {
    public ItemSyukurimuChocolate() {
        super(20, 20, false);
        setTranslationKey("syukurimu_chocolate");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_chocolate"));
        setAlwaysEdible();
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        PotionEffect effect = new PotionEffect(Potion.getPotionById(21), 5000, 255);
        player.addPotionEffect(effect);
    }

}



