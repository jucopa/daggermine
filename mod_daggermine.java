package jucopa.daggermine;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.EnumHelper;


@Mod(modid = "daggermine", name = "daggermine", version = "1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_daggermine
{

// public stuff goes here

	// material of items                                                           harvestlvl  uses  effective dammage enchant
	static EnumToolMaterial EnumToolMaterialdaedric= EnumHelper.addToolMaterial("daedric", 10, 3000, 30.0F, 10, 30);
	static EnumToolMaterial EnumToolMaterialorcish= EnumHelper.addToolMaterial("orcish", 9, 2600, 26.0F, 9, 25);
	static EnumToolMaterial EnumToolMaterialebony= EnumHelper.addToolMaterial("ebony", 8, 2200, 22.0F, 8, 20);
	static EnumToolMaterial EnumToolMaterialadamantium= EnumHelper.addToolMaterial("adamantium", 7, 1800, 18.0F, 7, 18);
	static EnumToolMaterial EnumToolMaterialmithril= EnumHelper.addToolMaterial("mithril", 6, 1400, 14.0F, 6, 25);
	static EnumToolMaterial EnumToolMaterialdwarven= EnumHelper.addToolMaterial("dwarven", 5, 1000, 10.0F, 5, 17);
	static EnumToolMaterial EnumToolMaterialelven= EnumHelper.addToolMaterial("elven", 4, 600, 6.0F, 4, 19);
	static EnumToolMaterial EnumToolMaterialsilver= EnumHelper.addToolMaterial("silver", 2, 200, 2.0F, 2, 64);
	static EnumToolMaterial EnumToolMaterialsteel= EnumHelper.addToolMaterial("steel", 2, 550, 5.0F, 3, 12);
	
	//tools swords etc
	
	public static Item daedricAxe;
	public static Item daedricShovel;
	public static Item daedricSword;
	public static Item daedricPickaxe;
	public static Item daedricHoe;
	public static Item orcishAxe;
	public static Item orcishShovel;
	public static Item orcishSword;
	public static Item orcishPickaxe;
	public static Item elvenAxe;
	public static Item ebonyShovel;
	public static Item ebonySword;
	public static Item ebonyPickaxe;
	public static Item ebonyAxe;
	public static Item adamantiumShovel;
	public static Item adamantiumSword;
	public static Item adamantiumPickaxe;
	public static Item adamantiumAxe;
	public static Item mithrilShovel;
	public static Item mithrilSword;
	public static Item mithrilPickaxe;
	public static Item mithrilAxe;
	public static Item dwarvenShovel;
	public static Item dwarvenSword;
	public static Item dwarvenPickaxe;
	public static Item dwarvenAxe;
	public static Item elvenShovel;
	public static Item elvenSword;
	public static Item elvenPickaxe;
	public static Item steelAxe;
	public static Item steelSword;
	public static Item steelPickaxe;
	public static Item steelShovel;
	public static Item silverAxe;
	public static Item silverSword;
	public static Item silverPickaxe;
	public static Item silverShovel;
	
	
//blocks
	public static Block daedricore;
	public static Block orcishore;
	public static Block ebonyore;
	public static Block adamantiumore;
	public static Block mithrilore;
	public static Block dwarvenore;
	public static Block elvenore;
	public static Block silverore;
	
	//bars/ingots
	public static Item daedricbar;
	public static Item orcishbar;
	public static Item ebonybar;
	public static Item adamantiumbar;
	public static Item mithrilbar;
	public static Item dwarvenbar;
	public static Item elvenbar;
	public static Item silverbar;
	public static Item steelbar;
	
	//armors

	
	
	//guns and spells
public static final CreativeTabs tabNAME= new tabdaggermine(12, "daggermine");
	//bows
public static final Item daedricbow= new ItemBow(2400).setUnlocalizedName("daedricbow");
public static final Item orcishbow= new ItemBow(2401).setUnlocalizedName("orcishbow");
public static final Item ebonybow= new ItemBow(2402).setUnlocalizedName("ebonybow");
public static final Item adamantiumbow= new ItemBow(2403).setUnlocalizedName("adamantiumbow");
public static final Item mithrilbow= new ItemBow(2404).setUnlocalizedName("mithrilbow");
public static final Item dwarvenbow= new ItemBow(2405).setUnlocalizedName("dwarvenbow");
public static final Item elvenbow= new ItemBow(2406).setUnlocalizedName("elvenbow");
public static final Item silverbow= new ItemBow(2407).setUnlocalizedName("silverbow");
public static final Item steelbow= new ItemBow(2408).setUnlocalizedName("steelbow");


//guns
public static final Item cartridge = new ItemCartridge(2409).setUnlocalizedName("cartridge");
public static final Item GUN = new ItemMAP(2410).setUnlocalizedName("gun");

	


	

//Game Registrys and Language Registrys go Here
@Init
public void load(FMLInitializationEvent event)
{

	
	


//crafting

		



;
	//registry
	EntityRegistry.registerModEntity(EntityMAPItem.class, "NAMEITEM", 2, this, 40, 3, true);
	
	EntityRegistry.registerModEntity(Entitydaedralord.class, "daedralord", 1, this, 80, 3, true);
	EntityRegistry.addSpawn(Entitydaedralord.class, 10, 2, 6, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
LanguageRegistry.instance().addStringLocalization("entity.daggermine.daedralord.name", "daedra lord");
	
	//tools etc
	daedricAxe = new daedricAxe(2419, EnumToolMaterialdaedric).setUnlocalizedName("daedricaxe");
	daedricShovel = new daedricShovel(2420, EnumToolMaterialdaedric).setUnlocalizedName("daedricshovel");
	daedricPickaxe = new daedricPickaxe(2421, EnumToolMaterialdaedric).setUnlocalizedName("daedricpickaxe");
	daedricHoe = new daedricHoe(2422, EnumToolMaterialdaedric).setUnlocalizedName("daedrichoe");
	daedricSword = new daedricSword(2423, EnumToolMaterialdaedric).setUnlocalizedName("daedricsword");
	
	LanguageRegistry.addName(daedricAxe, "daedric Axe");
	LanguageRegistry.addName(daedricShovel, "daedric Shovel ");
	LanguageRegistry.addName(daedricPickaxe, "daedric Pickaxe");
	LanguageRegistry.addName(daedricSword, "daedric Sword");
	LanguageRegistry.addName(daedricHoe, "daedric Hoe");
	
	orcishAxe = new orcishAxe(2424, EnumToolMaterialorcish).setUnlocalizedName("orcishaxe");
	orcishShovel = new orcishShovel(2425, EnumToolMaterialorcish).setUnlocalizedName("orcishshovel");
	orcishPickaxe = new orcishPickaxe(2426, EnumToolMaterialorcish).setUnlocalizedName("orcishpickaxe");
	orcishSword = new orcishSword(2427, EnumToolMaterialorcish).setUnlocalizedName("orcishsword");
	
	LanguageRegistry.addName(orcishAxe, "orcish Axe");
	LanguageRegistry.addName(orcishShovel, "orcish Shovel ");
	LanguageRegistry.addName(orcishPickaxe, "orcish Pickaxe");
	LanguageRegistry.addName(orcishSword, "orcish Sword");
	
	ebonyAxe = new ebonyAxe(2428, EnumToolMaterialdaedric).setUnlocalizedName("ebonyaxe");
	ebonyShovel = new ebonyShovel(2429, EnumToolMaterialdaedric).setUnlocalizedName("ebonyshovel");
	ebonyPickaxe = new ebonyPickaxe(2430, EnumToolMaterialdaedric).setUnlocalizedName("ebonypickaxe");
	ebonySword = new ebonySword(2431, EnumToolMaterialdaedric).setUnlocalizedName("ebonysword");
	
	LanguageRegistry.addName(ebonyAxe, "ebony Axe");
	LanguageRegistry.addName(ebonyShovel, "ebony Shovel ");
	LanguageRegistry.addName(ebonyPickaxe, "ebony Pickaxe");
	LanguageRegistry.addName(ebonySword, "ebony Sword");
	
	adamantiumAxe = new adamantiumAxe(2432, EnumToolMaterialdaedric).setUnlocalizedName("adamantiumaxe");
	adamantiumShovel = new adamantiumShovel(2433, EnumToolMaterialdaedric).setUnlocalizedName("adamantiumshovel");
	adamantiumPickaxe = new adamantiumPickaxe(2434, EnumToolMaterialdaedric).setUnlocalizedName("adamantiumpickaxe");
	adamantiumSword = new adamantiumSword(2435, EnumToolMaterialdaedric).setUnlocalizedName("adamantiumsword");
	
	LanguageRegistry.addName(adamantiumAxe, "adamantium Axe");
	LanguageRegistry.addName(adamantiumShovel, "adamantium Shovel ");
	LanguageRegistry.addName(adamantiumPickaxe, "adamantium Pickaxe");
	LanguageRegistry.addName(adamantiumSword, "adamantium Sword");
	
	mithrilAxe = new mithrilAxe(2436, EnumToolMaterialdaedric).setUnlocalizedName("mithrilaxe");
	mithrilShovel = new mithrilShovel(2477, EnumToolMaterialdaedric).setUnlocalizedName("mithrilshovel");
	mithrilPickaxe = new mithrilPickaxe(2437, EnumToolMaterialdaedric).setUnlocalizedName("mithrilpickaxe");
	mithrilSword = new mithrilSword(2438, EnumToolMaterialdaedric).setUnlocalizedName("mithrilsword");
	
	LanguageRegistry.addName(mithrilAxe, "mithril Axe");
	LanguageRegistry.addName(mithrilShovel, "mithril Shovel ");
	LanguageRegistry.addName(mithrilPickaxe, "mithril Pickaxe");
	LanguageRegistry.addName(mithrilSword, "mithril Sword");
	
	dwarvenAxe = new dwarvenAxe(2439, EnumToolMaterialdaedric).setUnlocalizedName("dwarvenaxe");
	dwarvenShovel = new dwarvenShovel(2440, EnumToolMaterialdaedric).setUnlocalizedName("dwarvenshovel");
	dwarvenPickaxe = new dwarvenPickaxe(2441, EnumToolMaterialdaedric).setUnlocalizedName("dwarvenpickaxe");
	dwarvenSword = new dwarvenSword(2442, EnumToolMaterialdaedric).setUnlocalizedName("dwarvensword");
	
	LanguageRegistry.addName(dwarvenAxe, "dwarven Axe");
	LanguageRegistry.addName(dwarvenShovel, "dwarven Shovel ");
	LanguageRegistry.addName(dwarvenPickaxe, "dwarven Pickaxe");
	LanguageRegistry.addName(dwarvenSword, "dwarven Sword");
	
	elvenAxe = new elvenAxe(2443, EnumToolMaterialdaedric).setUnlocalizedName("elvenaxe");
	elvenShovel = new elvenShovel(2444, EnumToolMaterialdaedric).setUnlocalizedName("elvenshovel");
	elvenPickaxe = new elvenPickaxe(2445, EnumToolMaterialdaedric).setUnlocalizedName("elvenpickaxe");
	elvenSword = new elvenSword(2446, EnumToolMaterialdaedric).setUnlocalizedName("elvensword");
	
	LanguageRegistry.addName(elvenAxe, "elven Axe");
	LanguageRegistry.addName(elvenShovel, "elven Shovel ");
	LanguageRegistry.addName(elvenPickaxe, "elven Pickaxe");
	LanguageRegistry.addName(elvenSword, "elven Sword");
	
	silverAxe = new silverAxe(2447, EnumToolMaterialdaedric).setUnlocalizedName("silveraxe");
	silverShovel = new silverShovel(2448, EnumToolMaterialdaedric).setUnlocalizedName("silvershovel");
	silverPickaxe = new silverPickaxe(2449, EnumToolMaterialdaedric).setUnlocalizedName("silverpickaxe");
	silverSword = new silverSword(2450, EnumToolMaterialdaedric).setUnlocalizedName("silversword");
	
	LanguageRegistry.addName(silverAxe, "silver Axe");
	LanguageRegistry.addName(silverShovel, "silver Shovel ");
	LanguageRegistry.addName(silverPickaxe, "silver Pickaxe");
	LanguageRegistry.addName(silverSword, "silver Sword");
	
	steelAxe = new steelAxe(2451, EnumToolMaterialdaedric).setUnlocalizedName("steelaxe");
	steelShovel = new steelShovel(2452, EnumToolMaterialdaedric).setUnlocalizedName("steelshovel");
	steelPickaxe = new steelPickaxe(2453, EnumToolMaterialdaedric).setUnlocalizedName("steelpickaxe");
	steelSword = new steelSword(2455, EnumToolMaterialdaedric).setUnlocalizedName("steelsword");
	
	LanguageRegistry.addName(steelAxe, "steel Axe");
	LanguageRegistry.addName(steelShovel, "steel Shovel ");
	LanguageRegistry.addName(steelPickaxe, "steel Pickaxe");
	LanguageRegistry.addName(steelSword, "steel Sword");
	
	
//bows
LanguageRegistry.addName(GUN, "MAP Item");
LanguageRegistry.addName(cartridge, "cartridge");
LanguageRegistry.addName(daedricbow, "daedric bow");
LanguageRegistry.addName(orcishbow, "orcish bow");
LanguageRegistry.addName(ebonybow, "ebony bow");
LanguageRegistry.addName(adamantiumbow, "adamantium bow");
LanguageRegistry.addName(mithrilbow, "mithril bow");
LanguageRegistry.addName(dwarvenbow, "dwarven bow");
LanguageRegistry.addName(elvenbow, "elven bow");
LanguageRegistry.addName(silverbow, "silver bow");
LanguageRegistry.addName(steelbow, "steel bow");

//bars

daedricbar = new daedricbar(4019).setUnlocalizedName("daedricbar");
orcishbar = new orcishbar(4020).setUnlocalizedName("orcishbar");
ebonybar = new ebonybar(4021).setUnlocalizedName("ebonybar");
adamantiumbar = new adamantiumbar(4022).setUnlocalizedName("adamantiumbar");
mithrilbar = new mithrilbar(4023).setUnlocalizedName("mithrilbar");
dwarvenbar = new dwarvenbar(4024).setUnlocalizedName("dwarvenbar");
elvenbar = new elvenbar(4025).setUnlocalizedName("elvenbar");
silverbar = new silverbar(4026).setUnlocalizedName("silverbar");
steelbar = new steelbar(4027).setUnlocalizedName("steelbar");


LanguageRegistry.addName(daedricbar, "daedric bar");
LanguageRegistry.addName(orcishbar, "orcish bar");
LanguageRegistry.addName(ebonybar, "ebony bar");
LanguageRegistry.addName(adamantiumbar, "adamantium bar");
LanguageRegistry.addName(mithrilbar, "mithril bar");
LanguageRegistry.addName(dwarvenbar, "dwarven bar");
LanguageRegistry.addName(elvenbar, "elven bar");
LanguageRegistry.addName(silverbar, "silver bar");
LanguageRegistry.addName(steelbar, "steel bar");

//blocks
daedricore= new daedricore(2411, "daedric ore").setUnlocalizedName("daedricore").setHardness(30.0F).setStepSound(Block.soundMetalFootstep).setResistance(130.0F);
GameRegistry.registerBlock(daedricore, "daedric ore");
LanguageRegistry.addName(daedricore, "daedric ore");

orcishore= new orcishore(2412, "orcish ore").setUnlocalizedName("orcishore").setHardness(28.0F).setStepSound(Block.soundMetalFootstep).setResistance(28.0F);
GameRegistry.registerBlock(orcishore, "orcish ore");
LanguageRegistry.addName(orcishore, "orcish ore");


ebonyore= new ebonyore(2413, "ebonyore").setUnlocalizedName("ebonyore").setHardness(26.0F).setStepSound(Block.soundMetalFootstep).setResistance(26.0F);
GameRegistry.registerBlock(ebonyore, "ebony ore");
LanguageRegistry.addName(ebonyore, "ebony ore");

adamantiumore= new adamantiumore(2414, "adamantiumore").setUnlocalizedName("adamantiumore").setHardness(24.0F).setStepSound(Block.soundMetalFootstep).setResistance(24.0F);
GameRegistry.registerBlock(adamantiumore, "adamantium ore");
LanguageRegistry.addName(adamantiumore, "adamantium ore");

dwarvenore= new dwarvenore(2415, "dwarvenore").setUnlocalizedName("dwarvenore").setHardness(20.0F).setStepSound(Block.soundMetalFootstep).setResistance(20.0F);
GameRegistry.registerBlock(dwarvenore, "dwarven ore");
LanguageRegistry.addName(dwarvenore, "dwarven ore");

mithrilore= new mithrilore(2416, "mithrilore").setUnlocalizedName("mithrilore").setHardness(22.0F).setStepSound(Block.soundMetalFootstep).setResistance(22.0F);
GameRegistry.registerBlock(mithrilore, "mithril ore");
LanguageRegistry.addName(mithrilore, "mithril ore");

elvenore= new elvenore(2417, "elvenore").setUnlocalizedName("elvenore").setHardness(18.0F).setStepSound(Block.soundMetalFootstep).setResistance(18.0F);
GameRegistry.registerBlock(elvenore, "elven ore");
LanguageRegistry.addName(elvenore, "elven ore");

silverore= new silverore(2418, "silverore").setUnlocalizedName("silverore").setHardness(6.0F).setStepSound(Block.soundMetalFootstep).setResistance(6.0F);
GameRegistry.registerBlock(silverore, "silver ore");
LanguageRegistry.addName(silverore, "silver ore");

GameRegistry.registerWorldGenerator(new WorldGeneratordaggermine());
GameRegistry.registerWorldGenerator(new WorldGeneratororcish());
GameRegistry.registerWorldGenerator(new WorldGeneratorebony());
GameRegistry.registerWorldGenerator(new WorldGeneratoradamantium());
GameRegistry.registerWorldGenerator(new WorldGeneratoremithril());
GameRegistry.registerWorldGenerator(new WorldGeneratordwarven());
GameRegistry.registerWorldGenerator(new WorldGeneratorelven());
GameRegistry.registerWorldGenerator(new WorldGeneratorsilver());

//swords crafting
GameRegistry.addRecipe(new ItemStack(daedricSword), new Object[]{
    "ZXZ",
    " X ",
    " C ",
    'X', mod_daggermine.daedricbar, 'C', Item.stick, 'Z',  Block.obsidian,
});

GameRegistry.addRecipe(new ItemStack(orcishSword), new Object[]{
    " X ",
    " X ",
    " C ",
    'X', mod_daggermine.orcishbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(ebonySword), new Object[]{
    " X ",
    " X ",
    " C ",
    'X', mod_daggermine.ebonybar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(adamantiumSword), new Object[]{
    " X ",
    " X ",
    " C ",
    'X', mod_daggermine.adamantiumbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(mithrilSword), new Object[]{
    " X ",
    " X ",
    " C ",
    'X', mod_daggermine.mithrilbar, 'C', Item.stick,
});


GameRegistry.addRecipe(new ItemStack(dwarvenSword), new Object[]{
    " X ",
    " X ",
    " C ",
    'X', mod_daggermine.dwarvenbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(elvenSword), new Object[]{
    " X ",
    " X ",
    " C ",
    'X', mod_daggermine.elvenbar, 'C', Item.stick,
});



GameRegistry.addRecipe(new ItemStack(silverSword), new Object[]{
    " X ",
    " X ",
    " C ",
    'X', mod_daggermine.silverbar, 'C', Item.stick,
});


GameRegistry.addRecipe(new ItemStack(steelSword), new Object[]{
    " X ",
    " X ",
    " C ",
    'X', mod_daggermine.steelbar, 'C', Item.stick,
});


//picks then axes then hoes etc tools XD 

GameRegistry.addRecipe(new ItemStack(daedricPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.daedricbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(orcishPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.orcishbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(ebonyPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.ebonybar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(adamantiumPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.adamantiumbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(mithrilPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.mithrilbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(dwarvenPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.dwarvenbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(elvenPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.elvenbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(silverPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.silverbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(steelPickaxe), new Object[]{
    "XXX",
    " C ",
    " C ",
    'X', mod_daggermine.steelbar, 'C', Item.stick,
});


// end of picks now axes

GameRegistry.addRecipe(new ItemStack(daedricAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.daedricbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(orcishAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.orcishbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(ebonyAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.ebonybar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(adamantiumAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.adamantiumbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(mithrilAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.mithrilbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(dwarvenAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.dwarvenbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(elvenAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.elvenbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(silverAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.elvenbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(steelAxe), new Object[]{
    "XX ",
    " C ",
    " C ",
    'X', mod_daggermine.steelbar, 'C', Item.stick,
});

// shovels
GameRegistry.addRecipe(new ItemStack(daedricShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.daedricbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(orcishShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.orcishbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(ebonyShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.ebonybar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(adamantiumShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.adamantiumbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(mithrilShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.mithrilbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(dwarvenShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.dwarvenbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(elvenShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.elvenbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(silverShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.silverbar, 'C', Item.stick,
});

GameRegistry.addRecipe(new ItemStack(steelShovel), new Object[]{
    " X ",
    " C ",
    " C ",
    'X', mod_daggermine.steelbar, 'C', Item.stick,
});



//bows

GameRegistry.addRecipe(new ItemStack(daedricbow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.daedricbar, 'C', Item.silk,
});

GameRegistry.addRecipe(new ItemStack(orcishbow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.orcishbar, 'C', Item.silk,
});

GameRegistry.addRecipe(new ItemStack(ebonybow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.ebonybar, 'C', Item.silk,
});

GameRegistry.addRecipe(new ItemStack(adamantiumbow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.adamantiumbar, 'C', Item.silk,
});

GameRegistry.addRecipe(new ItemStack(mithrilbow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.mithrilbar, 'C', Item.silk,
});

GameRegistry.addRecipe(new ItemStack(dwarvenbow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.dwarvenbar, 'C', Item.silk,
});

GameRegistry.addRecipe(new ItemStack(elvenbow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.elvenbar, 'C', Item.silk,
});

GameRegistry.addRecipe(new ItemStack(silverbow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.silverbar, 'C', Item.silk,
});

GameRegistry.addRecipe(new ItemStack(steelbow), new Object[]{
    " XC",
    "X C",
    " XC",
    'X', mod_daggermine.steelbar, 'C', Item.silk,
});


//now onto hoes and etc tools

GameRegistry.addRecipe(new ItemStack(daedricHoe), new Object[]{
    "XX ",
    "XC ",
    " C ",
    'X', mod_daggermine.daedricbar, 'C', Item.stick,
});


//smelting codes
FurnaceRecipes.smelting().addSmelting(mod_daggermine.daedricore.blockID, 0, new ItemStack(daedricbar), 0.1F);
FurnaceRecipes.smelting().addSmelting(mod_daggermine.orcishore.blockID, 0, new ItemStack(orcishbar), 0.1F);
FurnaceRecipes.smelting().addSmelting(mod_daggermine.ebonyore.blockID, 0, new ItemStack(ebonybar), 0.1F);
FurnaceRecipes.smelting().addSmelting(mod_daggermine.adamantiumore.blockID, 0, new ItemStack(adamantiumbar), 0.1F);
FurnaceRecipes.smelting().addSmelting(mod_daggermine.mithrilore.blockID, 0, new ItemStack(mithrilbar), 0.1F);
FurnaceRecipes.smelting().addSmelting(mod_daggermine.dwarvenore.blockID, 0, new ItemStack(dwarvenbar), 0.1F);
FurnaceRecipes.smelting().addSmelting(mod_daggermine.elvenore.blockID, 0, new ItemStack(elvenbar), 0.1F);
FurnaceRecipes.smelting().addSmelting(mod_daggermine.silverore.blockID, 0, new ItemStack(silverbar), 0.1F);
FurnaceRecipes.smelting().addSmelting(Item.ingotIron.itemID, 0, new ItemStack(steelbar), 0.1F);


}





}
