package com.natamus.naturallychargedcreepers.forge.events;

import com.natamus.naturallychargedcreepers.events.CreeperChargeEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeCreeperChargeEvent {
	@SubscribeEvent
	public void onEntityJoin(EntityJoinLevelEvent e) {
		CreeperChargeEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
