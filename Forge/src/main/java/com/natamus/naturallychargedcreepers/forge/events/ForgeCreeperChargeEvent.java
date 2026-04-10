package com.natamus.naturallychargedcreepers.forge.events;

import com.natamus.naturallychargedcreepers.events.CreeperChargeEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeCreeperChargeEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeCreeperChargeEvent.class);

		EntityJoinLevelEvent.BUS.addListener(ForgeCreeperChargeEvent::onEntityJoin);
	}

	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		CreeperChargeEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
