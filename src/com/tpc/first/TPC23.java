package com.tpc.first;

import kr.bit.structure.Airplane;
import kr.bit.structure.SuperSonicAirplane;

public class TPC23 {
	public static void main(String[] args) {
		SuperSonicAirplane superSonic = new SuperSonicAirplane();
		superSonic.takeOff();
		superSonic.fly();
		superSonic.flyMode = SuperSonicAirplane.SPECIAL;
		superSonic.fly();
		superSonic.flyMode = SuperSonicAirplane.NORMAL;
		superSonic.fly();
		superSonic.land();
		
		System.out.println();
		Airplane superSonic2 = new SuperSonicAirplane();
		superSonic2.takeOff();
		superSonic2.fly();
		((SuperSonicAirplane)superSonic2).flyMode = SuperSonicAirplane.SPECIAL;
		superSonic2.fly();
		((SuperSonicAirplane)superSonic2).flyMode = SuperSonicAirplane.NORMAL;
		superSonic2.fly();
		superSonic2.land();
		
	}
}
