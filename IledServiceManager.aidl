// ILedServiceManager.aidl
package com.example.startandbound_001;

// Declare any non-default types here with import statements

interface ILedServiceManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    int getLedStatus();
    int setLedStatus(int ledState);
}
