
package jucopa.daggermine;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCartridge extends Item{

public ItemCartridge(int par1){
super(par1);
this.maxStackSize = 4; //how many in a full stack
this.setMaxDamage(14); //durability of cartridge
this.setCreativeTab(mod_daggermine.tabNAME);
}

}
