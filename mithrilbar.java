package jucopa.daggermine;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;


public class mithrilbar extends Item {
public mithrilbar(int par1) {
super(par1); //Returns super constructor: par1 is ID
setCreativeTab(CreativeTabs.tabMaterials); //Tells the game what creative mode tab it goes in
}
}
