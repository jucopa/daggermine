
package jucopa.daggermine;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class ItemMAP extends Item{

public ItemMAP(int par1){
super(par1);
this.maxStackSize = 1;
this.setCreativeTab(mod_daggermine.tabNAME);
}
public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
EntityMAPItem bullet = new EntityMAPItem(par2World, par3EntityPlayer);

if (!par3EntityPlayer.capabilities.isCreativeMode && par3EntityPlayer.inventory.hasItem(mod_daggermine.cartridge.itemID)){
ItemStack cartridge = new ItemStack(mod_daggermine.cartridge);
cartridge.damageItem(1, par3EntityPlayer);
if (!par2World.isRemote){
par2World.spawnEntityInWorld(bullet);
}
}

if (par3EntityPlayer.capabilities.isCreativeMode){
if (!par2World.isRemote){
par2World.spawnEntityInWorld(bullet);
}
}

return par1ItemStack;
}
}
