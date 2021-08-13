package jp.syukurimu;
import net.minecraft.command.ICommand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemSyukurimuMaccha extends ItemFood {
    public ItemSyukurimuMaccha() {
        super(20, 20, false);
        setTranslationKey("syukurimu_maccha");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_macch"));
        setAlwaysEdible();
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        PotionEffect effect = new PotionEffect(Potion.getPotionById(8), 100, 15);
        player.addPotionEffect(effect);

    }

}



