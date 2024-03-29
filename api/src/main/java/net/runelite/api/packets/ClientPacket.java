package net.runelite.api.packets;

public interface ClientPacket
{
	int getId();
	int getLength();
	ClientPacket EVENT_KEYBOARD();
	ClientPacket BUTTON_CLICK();
	ClientPacket OPPLAYER8();
	ClientPacket REFLECTION_CHECK_REPLY();
	ClientPacket OPOBJ2();
	ClientPacket OPHELD5();
	ClientPacket OPNPCT();
	ClientPacket OPLOCU();
	ClientPacket OPNPC4();
	ClientPacket OPOBJT();
	ClientPacket OPLOC3();
	ClientPacket IF_BUTTON8();
	ClientPacket OPNPC2();
	ClientPacket OPNPC5();
	ClientPacket OPPLAYER3();
	ClientPacket IF_BUTTON1();
	ClientPacket OPPLAYER6();
	ClientPacket OPLOCT();
	ClientPacket OPPLAYER4();
	ClientPacket OPHELD2();
	ClientPacket OPLOC5();
	ClientPacket IF_BUTTON9();
	ClientPacket OPLOC2();
	ClientPacket OPNPCU();
	ClientPacket IF_BUTTON4();
	ClientPacket OPHELDU();
	ClientPacket OPPLAYER2();
	ClientPacket OPOBJ6();
	ClientPacket IF_BUTTON2();
	ClientPacket OPPLAYER5();
	ClientPacket OPPLAYERT();
	ClientPacket IF_BUTTONT();
	ClientPacket OPPLAYERU();
	ClientPacket OPHELD4();
	ClientPacket OPHELD3();
	ClientPacket OPOBJ5();
	ClientPacket OPLOC6();
	ClientPacket OPPLAYER7();
	ClientPacket IF1_BUTTON4();
	ClientPacket OPHELD1();
	ClientPacket OPNPC1();
	ClientPacket OPOBJ4();
	ClientPacket OPOBJU();
	ClientPacket IF_BUTTON10();
	ClientPacket OPPLAYER1();
	ClientPacket IF_BUTTON3();
	ClientPacket IF_BUTTON6();
	ClientPacket IF1_BUTTON1();
	ClientPacket IF_BUTTON7();
	ClientPacket IF1_BUTTON2();
	ClientPacket OPLOC4();
	ClientPacket IF1_BUTTON5();
	ClientPacket LOGIN_STATISTICS();
	ClientPacket OPOBJ3();
	ClientPacket IF_BUTTON5();
	ClientPacket OPOBJ1();
	ClientPacket MOVE_GAMECLICK();
	ClientPacket OPNPC3();
	ClientPacket OPNPC6();
	ClientPacket OPHELDT();
	ClientPacket EVENT_MOUSE_CLICK();
	ClientPacket IF1_BUTTON3();
	ClientPacket OPLOC1();
}