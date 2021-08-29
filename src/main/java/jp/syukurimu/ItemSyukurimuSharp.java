package jp.syukurimu;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.items.IItemHandler;

public class ItemSyukurimuSharp extends ItemFood {
    public ItemSyukurimuSharp() {
        super(20, 20, false);
        setTranslationKey("syukurimu_sharp");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_sharp"));
        setAlwaysEdible();
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean isHeld) {

        //if (EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(16), itemStack) <= 0) {
            itemStack.addEnchantment(Enchantment.getEnchantmentByID(16), 777);
        //}
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        PotionEffect effect = new PotionEffect(Potion.getPotionById(5), 5000, 255);

        player.addPotionEffect(effect);
    }

}





