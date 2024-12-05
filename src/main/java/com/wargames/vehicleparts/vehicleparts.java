package com.wargames.vehicleparts;

import com.wargames.vehicleparts.item.components_electronics;
import com.wargames.vehicleparts.item.components_mechanical;
import com.wargames.vehicleparts.item.components_plating;
import com.wargames.vehicleparts.item.components_rubber_basic;
import com.wargames.vehicleparts.item.components_scaffold;
import com.wargames.vehicleparts.item.components_steel;
import com.wargames.vehicleparts.item.components_wood;
import com.wargames.vehicleparts.item.drum;
import com.wargames.vehicleparts.item.flare;
import com.wargames.vehicleparts.item.kit_auto;
import com.wargames.vehicleparts.item.kit_hmg;
import com.wargames.vehicleparts.item.kit_repeating;
import com.wargames.vehicleparts.item.kit_revolver;
import com.wargames.vehicleparts.item.kit_shotgun;
import com.wargames.vehicleparts.item.kit_singleshot;
import com.wargames.vehicleparts.item.kit_smg;
import com.wargames.vehicleparts.item.part_airframe_heavy;
import com.wargames.vehicleparts.item.part_airframe_light;
import com.wargames.vehicleparts.item.part_airframe_medium;
import com.wargames.vehicleparts.item.part_bombbaydoors;
import com.wargames.vehicleparts.item.part_cannon_large;
import com.wargames.vehicleparts.item.part_cannon_medium;
import com.wargames.vehicleparts.item.part_cannon_small;
import com.wargames.vehicleparts.item.part_chassis_heavy;
import com.wargames.vehicleparts.item.part_chassis_light;
import com.wargames.vehicleparts.item.part_chassis_medium;
import com.wargames.vehicleparts.item.part_engine_heavy;
import com.wargames.vehicleparts.item.part_engine_light;
import com.wargames.vehicleparts.item.part_engine_medium;
import com.wargames.vehicleparts.item.part_floats;
import com.wargames.vehicleparts.item.part_frame;
import com.wargames.vehicleparts.item.part_gear;
import com.wargames.vehicleparts.item.part_grate;
import com.wargames.vehicleparts.item.part_helicopterblades;
import com.wargames.vehicleparts.item.part_helicopterframe_heavy;
import com.wargames.vehicleparts.item.part_helicopterframe_light;
import com.wargames.vehicleparts.item.part_helicopterframe_medium;
import com.wargames.vehicleparts.item.part_helicopterskids;
import com.wargames.vehicleparts.item.part_hull_heavy;
import com.wargames.vehicleparts.item.part_hull_light;
import com.wargames.vehicleparts.item.part_hull_medium;
import com.wargames.vehicleparts.item.part_instrumentcluster_advanced;
import com.wargames.vehicleparts.item.part_instrumentcluster_basic;
import com.wargames.vehicleparts.item.part_instrumentcluster_integrated;
import com.wargames.vehicleparts.item.part_mechanism_advanced;
import com.wargames.vehicleparts.item.part_mechanism_basic;
import com.wargames.vehicleparts.item.part_mechanism_complex;
import com.wargames.vehicleparts.item.part_plate;
import com.wargames.vehicleparts.item.part_plating_heavy;
import com.wargames.vehicleparts.item.part_plating_light;
import com.wargames.vehicleparts.item.part_plating_medium;
import com.wargames.vehicleparts.item.part_propeller_aircraft;
import com.wargames.vehicleparts.item.part_propeller_naval;
import com.wargames.vehicleparts.item.part_radar_advanced;
import com.wargames.vehicleparts.item.part_radar_basic;
import com.wargames.vehicleparts.item.part_radar_phased;
import com.wargames.vehicleparts.item.part_rifled_barrel;
import com.wargames.vehicleparts.item.part_rod;
import com.wargames.vehicleparts.item.part_ship_large;
import com.wargames.vehicleparts.item.part_ship_medium;
import com.wargames.vehicleparts.item.part_ship_small;
import com.wargames.vehicleparts.item.part_smoothbore_barrel;
import com.wargames.vehicleparts.item.part_spring;
import com.wargames.vehicleparts.item.part_suspension;
import com.wargames.vehicleparts.item.part_track;
import com.wargames.vehicleparts.item.part_tracks;
import com.wargames.vehicleparts.item.part_vls;
import com.wargames.vehicleparts.item.part_wheel;

import com.wargames.vehicleparts.item.*;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = "vp", name = "Vehicle Parts Mod", version = "0.1")
public class vehicleparts {
	
	public static Item components_electronics;
	public static Item components_mechanical;
	public static Item components_plating;
	public static Item components_scaffold;
	public static Item components_steel;
	public static Item components_wood;
	public static Item drum;
	public static Item flare;
	public static Item kit_auto;
	public static Item kit_hmg;
	public static Item kit_repeating;
	public static Item kit_revolver;
	public static Item kit_shotgun;
	public static Item kit_singleshot;
	public static Item kit_smg;
	public static Item part_cannon_large;
	public static Item part_cannon_medium;
	public static Item part_cannon_small;
	public static Item part_chassis_heavy;
	public static Item part_chassis_light;
	public static Item part_chassis_medium;
	public static Item part_engine_heavy;
	public static Item part_engine_light;
	public static Item part_engine_medium;
	public static Item part_frame;
	public static Item part_gear;
	public static Item part_grate;
	public static Item part_hull_heavy;
	public static Item part_hull_light;
	public static Item part_hull_medium;
	public static Item part_mechanism_advanced;
	public static Item part_mechanism_basic;
	public static Item part_mechanism_complex;
	public static Item part_plate;
	public static Item part_plating_heavy;
	public static Item part_plating_light;
	public static Item part_plating_medium;
	public static Item part_rifled_barrel;
	public static Item part_rod;
	public static Item part_ship_large;
	public static Item part_ship_medium;
	public static Item part_ship_small;
	public static Item part_smoothbore_barrel;
	public static Item part_spring;
	public static Item part_steel_wheel;
	public static Item part_suspension;
	public static Item part_track;
	public static Item part_tracks;
	public static Item part_wheel;
	

	public static Item components_rubber_basic;
	
	public static Item part_airframe_heavy;
	public static Item part_airframe_light;
	public static Item part_airframe_medium;
	
	public static Item part_bombbaydoors;
	public static Item part_float;
	public static Item part_helicopterblades;
	public static Item part_skid;
	
	public static Item part_helicopterframe_heavy;
	public static Item part_helicopterframe_light;
	public static Item part_helicopterframe_medium;
	
	public static Item part_instrumentcluster_advanced;
	public static Item part_instrumentcluster_basic;
	public static Item part_instrumentcluster_integrated;
	
	public static Item part_propeller_aircraft;
	public static Item part_propeller_naval;
	
	public static Item part_radar_advanced;
	public static Item part_radar_basic;
	public static Item part_radar_phased;
	
	public static Item part_vls;

	// Coins
	public static Item t1_missile_coin;
	public static Item t2_missile_coin;
	public static Item t3_missile_coin;
	public static Item t4_missile_coin;

	public static Item artillery_ammo_coin;
	public static Item turret_coin;
	public static Item forcefield_coin;

	public static Item cash;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block Init and Registering
		//Config Handling
		
		//Vehicle Parts:
		components_electronics = new components_electronics().setUnlocalizedName("ElectronicComponent").setTextureName("vp:components_electronics").setCreativeTab(tabVehicleParts);
		components_mechanical = new components_mechanical().setUnlocalizedName("MechanicalComponent").setTextureName("vp:components_mechanical").setCreativeTab(tabVehicleParts);
		components_plating = new components_plating().setUnlocalizedName("PlatingComponent").setTextureName("vp:components_plating").setCreativeTab(tabVehicleParts);
		components_scaffold = new components_scaffold().setUnlocalizedName("ScaffoldComponent").setTextureName("vp:components_scaffold").setCreativeTab(tabVehicleParts);
		components_steel = new components_steel().setUnlocalizedName("SteelComponent").setTextureName("vp:components_steel").setCreativeTab(tabVehicleParts);
		components_wood = new components_wood().setUnlocalizedName("WoodComponent").setTextureName("vp:components_wood").setCreativeTab(tabVehicleParts);
		drum = new drum().setUnlocalizedName("Drum").setTextureName("vp:drum").setCreativeTab(tabVehicleParts);
		flare = new flare().setUnlocalizedName("Flare").setTextureName("vp:flare").setCreativeTab(tabVehicleParts);
		kit_auto = new kit_auto().setUnlocalizedName("KitAuto").setTextureName("vp:kit_auto").setCreativeTab(tabVehicleParts);
		kit_hmg = new kit_hmg().setUnlocalizedName("KitHMG").setTextureName("vp:kit_hmg").setCreativeTab(tabVehicleParts);
		kit_repeating = new kit_repeating().setUnlocalizedName("KitRepeating").setTextureName("vp:kit_repeating").setCreativeTab(tabVehicleParts);
		kit_revolver = new kit_revolver().setUnlocalizedName("KitRevolver").setTextureName("vp:kit_revolver").setCreativeTab(tabVehicleParts);
		kit_shotgun = new kit_shotgun().setUnlocalizedName("KitShotgun").setTextureName("vp:kit_shotgun").setCreativeTab(tabVehicleParts);
		kit_singleshot = new kit_singleshot().setUnlocalizedName("KitSingleshot").setTextureName("vp:kit_singleshot").setCreativeTab(tabVehicleParts);
		kit_smg = new kit_smg().setUnlocalizedName("KitSMG").setTextureName("vp:kit_smg").setCreativeTab(tabVehicleParts);
		part_cannon_large = new part_cannon_large().setUnlocalizedName("LargeCannon").setTextureName("vp:part_cannon_large").setCreativeTab(tabVehicleParts);
		part_cannon_medium = new part_cannon_medium().setUnlocalizedName("MediumCannon").setTextureName("vp:part_cannon_medium").setCreativeTab(tabVehicleParts);
		part_cannon_small = new part_cannon_small().setUnlocalizedName("SmallCannon").setTextureName("vp:part_cannon_small").setCreativeTab(tabVehicleParts);
		part_chassis_heavy = new part_chassis_heavy().setUnlocalizedName("HeavyChassis").setTextureName("vp:part_chassis_heavy").setCreativeTab(tabVehicleParts);
		part_chassis_light = new part_chassis_light().setUnlocalizedName("LightChassis").setTextureName("vp:part_chassis_light").setCreativeTab(tabVehicleParts);
		part_chassis_medium = new part_chassis_medium().setUnlocalizedName("MediumChassis").setTextureName("vp:part_chassis_medium").setCreativeTab(tabVehicleParts);
		part_engine_heavy = new part_engine_heavy().setUnlocalizedName("HeavyEngine").setTextureName("vp:part_engine_heavy").setCreativeTab(tabVehicleParts);
		part_engine_light = new part_engine_light().setUnlocalizedName("LightEngine").setTextureName("vp:part_engine_light").setCreativeTab(tabVehicleParts);
		part_engine_medium = new part_engine_medium().setUnlocalizedName("MediumEngine").setTextureName("vp:part_engine_medium").setCreativeTab(tabVehicleParts);
		part_frame = new part_frame().setUnlocalizedName("Frame").setTextureName("vp:part_frame").setCreativeTab(tabVehicleParts);
		part_gear = new part_gear().setUnlocalizedName("Gear").setTextureName("vp:part_gear").setCreativeTab(tabVehicleParts);
		part_grate = new part_grate().setUnlocalizedName("Grate").setTextureName("vp:part_grate").setCreativeTab(tabVehicleParts);
		part_hull_heavy = new part_hull_heavy().setUnlocalizedName("HeavyHull").setTextureName("vp:part_hull_heavy").setCreativeTab(tabVehicleParts);
		part_hull_light = new part_hull_light().setUnlocalizedName("LightHull").setTextureName("vp:part_hull_light").setCreativeTab(tabVehicleParts);
		part_hull_medium = new part_hull_medium().setUnlocalizedName("MediumHull").setTextureName("vp:part_hull_medium").setCreativeTab(tabVehicleParts);
		part_mechanism_advanced = new part_mechanism_advanced().setUnlocalizedName("AdvancedMechanism").setTextureName("vp:part_mechanism_advanced").setCreativeTab(tabVehicleParts);
		part_mechanism_basic = new part_mechanism_basic().setUnlocalizedName("BasicMechanism").setTextureName("vp:part_mechanism_basic").setCreativeTab(tabVehicleParts);
		part_mechanism_complex = new part_mechanism_complex().setUnlocalizedName("ComplexMechanism").setTextureName("vp:part_mechanism_complex").setCreativeTab(tabVehicleParts);
		part_plate = new part_plate().setUnlocalizedName("Plate").setTextureName("vp:part_plate").setCreativeTab(tabVehicleParts);
		part_plating_heavy = new part_plating_heavy().setUnlocalizedName("HeavyPlating").setTextureName("vp:part_plating_heavy").setCreativeTab(tabVehicleParts);
		part_plating_light = new part_plating_light().setUnlocalizedName("LightPlating").setTextureName("vp:part_plating_light").setCreativeTab(tabVehicleParts);
		part_plating_medium = new part_plating_medium().setUnlocalizedName("MediumPlating").setTextureName("vp:part_plating_medium").setCreativeTab(tabVehicleParts);
		part_rifled_barrel = new part_rifled_barrel().setUnlocalizedName("RifledBarrel").setTextureName("vp:part_rifled_barrel").setCreativeTab(tabVehicleParts);
		part_rod = new part_rod().setUnlocalizedName("Rod").setTextureName("vp:part_rod").setCreativeTab(tabVehicleParts);
		part_ship_large = new part_ship_large().setUnlocalizedName("ShipPartLarge").setTextureName("vp:part_ship_large").setCreativeTab(tabVehicleParts);
		part_ship_medium = new part_ship_medium().setUnlocalizedName("ShipPartMedium").setTextureName("vp:part_ship_medium").setCreativeTab(tabVehicleParts);
		part_ship_small = new part_ship_small().setUnlocalizedName("SmallShipPart").setTextureName("vp:part_ship_small").setCreativeTab(tabVehicleParts);
		part_smoothbore_barrel = new part_smoothbore_barrel().setUnlocalizedName("SmoothboreBarrel").setTextureName("vp:part_smoothbore_barrel").setCreativeTab(tabVehicleParts);
		part_spring = new part_spring().setUnlocalizedName("Spring").setTextureName("vp:part_spring").setCreativeTab(tabVehicleParts);
		part_suspension = new part_suspension().setUnlocalizedName("Suspension").setTextureName("vp:part_suspension").setCreativeTab(tabVehicleParts);
     	part_track = new part_track().setUnlocalizedName("TrackPart").setTextureName("vp:part_track").setCreativeTab(tabVehicleParts);
		part_tracks = new part_tracks().setUnlocalizedName("Tracks").setTextureName("vp:part_tracks").setCreativeTab(tabVehicleParts);
		part_wheel = new part_wheel().setUnlocalizedName("Wheel").setTextureName("vp:part_wheel").setCreativeTab(tabVehicleParts);
		
		components_rubber_basic = new components_rubber_basic().setUnlocalizedName("RubberBasic").setTextureName("vp:components_rubber_basic").setCreativeTab(tabVehicleParts);
				
		part_airframe_heavy = new part_airframe_heavy().setUnlocalizedName("AirframeHeavy").setTextureName("vp:part_airframe_heavy").setCreativeTab(tabVehicleParts);
		part_airframe_light = new part_airframe_light().setUnlocalizedName("AirframeLight").setTextureName("vp:part_airframe_light").setCreativeTab(tabVehicleParts);
		part_airframe_medium = new part_airframe_medium().setUnlocalizedName("AirframeMedium").setTextureName("vp:part_airframe_medium").setCreativeTab(tabVehicleParts);
		
		part_bombbaydoors = new part_bombbaydoors().setUnlocalizedName("BombBayDoors").setTextureName("vp:part_bombbaydoors").setCreativeTab(tabVehicleParts);
		part_float = new part_floats().setUnlocalizedName("Float").setTextureName("vp:part_float").setCreativeTab(tabVehicleParts);
		part_helicopterblades = new part_helicopterblades().setUnlocalizedName("HelicopterBlades").setTextureName("vp:part_helicopterblades").setCreativeTab(tabVehicleParts);
		part_skid = new part_helicopterskids().setUnlocalizedName("Skid").setTextureName("vp:part_skid").setCreativeTab(tabVehicleParts);
		
		part_helicopterframe_heavy = new part_helicopterframe_heavy().setUnlocalizedName("HelicopterframeHeavy").setTextureName("vp:part_helicopterframe_heavy").setCreativeTab(tabVehicleParts);
		part_helicopterframe_light = new part_helicopterframe_light().setUnlocalizedName("HelicopterframeLight").setTextureName("vp:part_helicopterframe_light").setCreativeTab(tabVehicleParts);
		part_helicopterframe_medium = new part_helicopterframe_medium().setUnlocalizedName("HelicopterframeMedium").setTextureName("vp:part_helicopterframe_medium").setCreativeTab(tabVehicleParts);
		
		part_instrumentcluster_advanced = new part_instrumentcluster_advanced().setUnlocalizedName("InstrumentclusterAdvanced").setTextureName("vp:part_instrumentcluster_advanced").setCreativeTab(tabVehicleParts);
		part_instrumentcluster_basic = new part_instrumentcluster_basic().setUnlocalizedName("InstrumentclusterBasic").setTextureName("vp:part_instrumentcluster_basic").setCreativeTab(tabVehicleParts);
		part_instrumentcluster_integrated = new part_instrumentcluster_integrated().setUnlocalizedName("InstrumentclusterIntegrated").setTextureName("vp:part_instrumentcluster_integrated").setCreativeTab(tabVehicleParts);
		
		part_propeller_aircraft = new part_propeller_aircraft().setUnlocalizedName("PropellerAircraft").setTextureName("vp:part_propeller_aircraft").setCreativeTab(tabVehicleParts);
		part_propeller_naval = new part_propeller_naval().setUnlocalizedName("PropellerNaval").setTextureName("vp:part_propeller_naval").setCreativeTab(tabVehicleParts);
		
		part_radar_advanced = new part_radar_advanced().setUnlocalizedName("RadarAdvanced").setTextureName("vp:part_radar_advanced").setCreativeTab(tabVehicleParts);
		part_radar_basic = new part_radar_basic().setUnlocalizedName("RadarBasic").setTextureName("vp:part_radar_basic").setCreativeTab(tabVehicleParts);
		part_radar_phased = new part_radar_phased().setUnlocalizedName("RadarPhased").setTextureName("vp:part_radar_phased").setCreativeTab(tabVehicleParts);
		
		part_vls = new part_vls().setUnlocalizedName("VLS").setTextureName("vp:part_vls").setCreativeTab(tabVehicleParts);

		// Coins & Cash:
		t1_missile_coin = new t1_missile_coin().setUnlocalizedName("T1MissileCoin").setTextureName("vp:coin_t1_missile").setCreativeTab(tabVehicleParts);
		t2_missile_coin = new t2_missile_coin().setUnlocalizedName("T2MissileCoin").setTextureName("vp:coin_t2_missile").setCreativeTab(tabVehicleParts);
		t3_missile_coin = new t3_missile_coin().setUnlocalizedName("T3MissileCoin").setTextureName("vp:coin_t3_missile").setCreativeTab(tabVehicleParts);
		t4_missile_coin = new t4_missile_coin().setUnlocalizedName("T4MissileCoin").setTextureName("vp:coin_t4_missile").setCreativeTab(tabVehicleParts);
		artillery_ammo_coin = new artillery_ammo_coin().setUnlocalizedName("ArtilleryAmmoCoin").setTextureName("vp:coin_artillery_ammo").setCreativeTab(tabVehicleParts);
		turret_coin = new turret_coin().setUnlocalizedName("TurretCoin").setTextureName("vp:coin_turret").setCreativeTab(tabVehicleParts);
		forcefield_coin = new forcefield_coin().setUnlocalizedName("ForcefieldCoin").setTextureName("vp:coin_forcefield").setCreativeTab(tabVehicleParts);
		cash = new cash().setUnlocalizedName("Cash").setTextureName("vp:cash").setCreativeTab(tabVehicleParts);


		//Vehicle Part Registering:
		GameRegistry.registerItem(components_electronics, components_electronics.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(components_mechanical, components_mechanical.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(components_plating, components_plating.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(components_scaffold, components_scaffold.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(components_steel, components_steel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(components_wood, components_wood.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(drum, drum.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flare, flare.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(kit_auto, kit_auto.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(kit_hmg, kit_hmg.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(kit_repeating, kit_repeating.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(kit_revolver, kit_revolver.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(kit_shotgun, kit_shotgun.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(kit_singleshot, kit_singleshot.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(kit_smg, kit_smg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_cannon_large, part_cannon_large.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_cannon_medium, part_cannon_medium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_cannon_small, part_cannon_small.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_chassis_heavy, part_chassis_heavy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_chassis_light, part_chassis_light.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_chassis_medium, part_chassis_medium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_engine_heavy, part_engine_heavy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_engine_light, part_engine_light.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_engine_medium, part_engine_medium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_frame, part_frame.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_gear, part_gear.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_grate, part_grate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_hull_heavy, part_hull_heavy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_hull_light, part_hull_light.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_hull_medium, part_hull_medium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_mechanism_advanced, part_mechanism_advanced.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_mechanism_basic, part_mechanism_basic.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_mechanism_complex, part_mechanism_complex.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_plate, part_plate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_plating_heavy, part_plating_heavy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_plating_light, part_plating_light.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_plating_medium, part_plating_medium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_rifled_barrel, part_rifled_barrel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_rod, part_rod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_ship_large, part_ship_large.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_ship_medium, part_ship_medium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_ship_small, part_ship_small.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_smoothbore_barrel, part_smoothbore_barrel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_spring, part_spring.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_suspension, part_suspension.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_track, part_track.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_tracks, part_tracks.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_wheel, part_wheel.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(components_rubber_basic, components_rubber_basic.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_airframe_heavy, part_airframe_heavy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_airframe_light, part_airframe_light.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_airframe_medium, part_airframe_medium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_bombbaydoors, part_bombbaydoors.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_float, part_float.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_helicopterblades, part_helicopterblades.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_skid, part_skid.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(part_helicopterframe_heavy, part_helicopterframe_heavy.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(part_helicopterframe_light, part_helicopterframe_light.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(part_helicopterframe_medium, part_helicopterframe_medium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_instrumentcluster_advanced, part_instrumentcluster_advanced.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_instrumentcluster_basic, part_instrumentcluster_basic.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(part_instrumentcluster_integrated, part_instrumentcluster_integrated.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_propeller_aircraft, part_propeller_aircraft.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_propeller_naval, part_propeller_naval.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_radar_advanced, part_radar_advanced.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_radar_basic, part_radar_basic.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(part_radar_phased, part_radar_phased.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(part_vls, part_vls.getUnlocalizedName().substring(5));

		// Coins & Cash Registering:
		GameRegistry.registerItem(t1_missile_coin, t1_missile_coin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(t2_missile_coin, t2_missile_coin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(t3_missile_coin, t3_missile_coin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(t4_missile_coin, t4_missile_coin.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(artillery_ammo_coin, artillery_ammo_coin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(turret_coin, turret_coin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(forcefield_coin, forcefield_coin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cash, cash.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEnetity, Entity, GUI and Packet Registering
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabVehicleParts = new CreativeTabs("tabVehicleParts") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(part_wheel).getItem(); //sets the tab icon
		}
	};
}