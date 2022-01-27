
package net.mcreator.genshinweapon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.genshinweapon.GenshinWeaponModElements;

import java.util.List;

@GenshinWeaponModElements.ModElement.Tag
public class AquilaFavoniaItem extends GenshinWeaponModElements.ModElement {
	@ObjectHolder("genshin_weapon:aquila_favonia")
	public static final Item block = null;

	public AquilaFavoniaItem(GenshinWeaponModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3200;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.NETHERITE_INGOT));
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u897F\u98CE\u4E4B\u9E70\u7684\u6297\u4E89\uFF1A"));
				list.add(new StringTextComponent(
						"\u53D7\u5230\u4F24\u5BB3\u65F6\u89E6\u53D1\uFF1A\u9AD8\u626C\u6297\u4E89\u65D7\u53F7\u7684\u897F\u98CE\u9E70\u4E4B\u9B42\u82CF\u9192\uFF0C\u5BF9\u81EA\u8EAB\u65BD\u52A0\u77AC\u95F4\u6CBB\u7597I\uFF0C\u5E76\u5BF9\u5468\u56F4\u7684\u654C\u4EBA\u65BD\u52A0\u77AC\u95F4\u4F24\u5BB3I\u3002\u8BE5\u6548\u679C\u6BCF15\u79D2\u53EA\u80FD\u89E6\u53D1\u4E00\u6B21\u3002"));
			}
		}.setRegistryName("aquila_favonia"));
	}
}
