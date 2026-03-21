/**
 * Question 1: Smart Home Device System (OOP Concepts)
 */
abstract class Device {
    private String deviceName;
    private boolean powerStatus;

    public Device(String deviceName) {
        this.deviceName = deviceName;
        this.powerStatus = false;
    }

    public String getDeviceName() { return deviceName; }
    public boolean isPoweredOn() { return powerStatus; }

    public void turnOn() {
        powerStatus = true;
        System.out.println(deviceName + " is now POWERED ON.");
    }

    public void turnOff() {
        powerStatus = false;
        System.out.println(deviceName + " is now POWERED OFF.");
    }

    public abstract void displayStatus();
}

class Light extends Device {
    // Simple temperature variable
    private double currentRoomTemp = 27.5; 

    public Light(String name) { super(name); }

    @Override
    public void displayStatus() {
        if (isPoweredOn()) {
            System.out.println("[Light] Status: Illuminating");
            // Direct temperature display as you requested
            System.out.println("Current Room Temperature: " + currentRoomTemp + "°C");
        } else {
            System.out.println("[Light] Status: Idle");
        }
    }
}

/**
 * Question 2: Payment Processing System (SOLID - OCP & DIP)
 */
interface PaymentMethod {
    void processPayment(double amount);
}

class UPIPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI transaction for amount: $" + amount);
    }
}

class PaymentProcessor {
    public void executePayment(PaymentMethod method, double amount) {
        method.processPayment(amount);
    }
}

/**
 * Question 3: Notification System (SOLID - ISP & SRP)
 */
interface SMSSender { void sendSMS(); }

class SMSNotification implements SMSSender {
    @Override
    public void sendSMS() {
        System.out.println("SMS notification dispatched successfully.");
    }
}

/**
 * Main Execution Class
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SYSTEM INITIALIZED ===\n");

        // Simple Execution: Light ON and Temperature check
        Device hallLight = new Light("Hall Light");
        hallLight.turnOn();
        hallLight.displayStatus();

        System.out.println("\n--- Payment Transaction ---");
        PaymentProcessor processor = new PaymentProcessor();
        processor.executePayment(new UPIPayment(), 2500.75);

        System.out.println("\n--- Notification Service ---");
        SMSNotification sms = new SMSNotification();
        sms.sendSMS();
    }
}
