package org.example.Shields;

import org.example.Shieldable;

public abstract class Shield implements Shieldable {
    public int protectionPoint;

    public Shield(int protectionPoint) {
        this.protectionPoint = protectionPoint;
    }

    public int getProtectionPoint() {
        return protectionPoint;
    }
}
