package states;

import components.AvailableCode;
import components.MechModifier;

public class stGyroPrimitive implements ifGyro, ifState {
    private final static AvailableCode AC = new AvailableCode( AvailableCode.TECH_INNER_SPHERE );

    public stGyroPrimitive() {
        AC.SetISCodes( 'D', 'C', 'X', 'X', 'X' );
        AC.SetISDates( 0, 0, false, 2300, 0, 0, false, false );
        AC.SetISFactions( "", "", "TA", "" );
        AC.SetPBMAllowed( true );
        AC.SetPIMAllowed( true );
        AC.SetPrimitiveOnly( true );
        AC.SetSuperHeavyCompatible( false );
        AC.SetRulesLevels( AvailableCode.RULES_EXPERIMENTAL, AvailableCode.RULES_EXPERIMENTAL, AvailableCode.RULES_UNALLOWED, AvailableCode.RULES_UNALLOWED, AvailableCode.RULES_UNALLOWED );
    }

    public boolean HasCounterpart() {
        return false;
    }

    public double GetTonnage( int rating ) {
        return (double) ((int) ( rating * 0.01f + 0.99f ));
    }

    public int GetCrits() {
        return 4;
    }

    public String ActualName() {
        return "Primitive Gyro";
    }

    public String CritName() {
        return "Primitive Gyro";
    }

    public String LookupName() {
        return "Primitive Gyro";
    }

    public String ChatName() {
        return "Primitive Gyro";
    }

    public String MegaMekName( boolean UseRear ) {
        return "Gyro";
    }

    public String BookReference() {
        return "Interstellar Operations";
    }

    public String GetReportName() {
        return "Primitive";
    }

    public double GetBVMult() {
        return 0.5f;
    }
    
    public double GetCostMult() {
        return 300000.0f;
    }
    
    public AvailableCode GetAvailability() {
        return AC;
    }
    
    public MechModifier GetMechModifier() {
        return null;
    }

    @Override
    public String toString() {
        return "Primitive Gyro";
    }
}
