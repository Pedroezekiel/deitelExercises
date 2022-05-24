package assigment;


import java.util.Scanner;

public class Nokia {
        static Scanner input = new Scanner(System.in);
        static int userInput;
        public static void main(String[] args) {
            menu();

        }

        public static void menu(){
            System.out.println("""
                Nokia !!!
                
                Enter:
                1: Phonebook
                2: Messages
                3: Chat
                4: Call Register
                5: Tones
                6: Settings
                7: Call divert
                8: Games
                9: Calculator
                10: Remainder
                11: Clock
                12: Profile
                13: Sim Setting
                14: Back
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1 -> Phonebook();
                case 2 -> Messages();
                case 3 -> Chat();
                case 4 -> callRegister();
                case 5 -> Tones();
                case 6 -> Settings();
                case 7 -> callDivert();
                case 8 -> Games();
                case 9 -> Calculator();
                case 10 -> Remainder();
                case 11 -> Clock();
                case 12 -> Profile();
                case 13 -> simSetting();
                case 14 -> exit();
                default -> menu();
            }
        }

        private static void simSetting() {
            System.out.println("Sim Setting");
        }

        private static void Profile() {
            System.out.println("My profile");
        }

        private static void Clock() {
            System.out.println("""
                Clock
                1: Alarm clock
                2: Clock Settings
                3: Date Settings
                4: Stopwatch
                5: Countdown timer
                6: Auto update of date and time
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1 -> alarmClock();
                case 2 -> clockSettings();
                case 3 -> dateSettings();
                case 4 -> stopWatch();
                case 5 -> countdownTimer();
                case 6 -> autoUpdateOfTimeAndDate();
            }
        }

        private static void autoUpdateOfTimeAndDate() {
            System.out.println("Auto update time and date");
        }

        private static void countdownTimer() {
            System.out.println("Timer");
        }

        private static void stopWatch() {
            System.out.println("Stop Watch");
        }

        private static void dateSettings() {
            System.out.println("Date setting");
        }

        private static void clockSettings() {
            System.out.println("CLock setting");
        }

        private static void alarmClock() {
            System.out.println("Alarm");
        }

        private static void Remainder() {
            System.out.println("Remainder");
        }

        private static void Calculator() {
            System.out.println("Calculator");
        }

        private static void Games() {
            System.out.println("Games");
        }

        private static void callDivert() {
            System.out.println("Call divert");
        }

        private static void Settings() {
            System.out.println("""
                Settings
                1: call settings
                2: phone settings
                3: security settings
                4: restore factory settings
                5: back
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1 -> callSetting();
                case 2 -> phoneSetting();
                case 3 -> securitySetting();
                case 4 -> restoreSettings();
                case 5 -> menu();
                default -> Settings();
            }
        }

        private static void restoreSettings() {
            System.out.println("Restore setting");
        }

        private static void securitySetting() {
            System.out.println("""
                1: PIN code request
                2: Call barring service
                3: Fixed Dialing
                4: Closed user group
                5: Phone security
                6: Change access codes
                7: back
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1 -> pinCodeRequest();
                case 2 -> callBarringService();
                case 3 -> fixedDialing();
                case 4 -> closedUserGroup();
                case 5 -> phoneSecurity();
                case 6 -> changeAccessCodes();
                case 7 ->settings();
                default -> securitySetting();
            }
        }

        private static void changeAccessCodes() {
            System.out.println("Change Access codes");
        }

        private static void phoneSecurity() {
            System.out.println("Phone security");
        }

        private static void closedUserGroup() {
            System.out.println("Closed user group");
        }

        private static void fixedDialing() {
            System.out.println("Fixed Dialling");
        }

        private static void callBarringService() {
            System.out.println("Call service");
        }

        private static void pinCodeRequest() {
            System.out.println("code request");
        }

        private static void phoneSetting() {
            System.out.println("""
                1: Language
                2: Cell info displau
                3: Welcome note
                4: Network selection
                5: Lights
                6: Confirm SIM service actions
                7: back
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1 -> language();
                case 2 -> callInfoDisplay();
                case 3 -> welcomeNote();
                case 4 -> networkSelection();
                case 5 -> lights();
                case 6 -> simService();
                case 7 -> settings();
                default -> phoneSetting();
            }

        }

        private static void settings() {
            System.out.println("Settings");
        }

        private static void simService() {
            System.out.println("Service");
        }

        private static void lights() {
            System.out.println("Select ligth");
        }

        private static void networkSelection() {
            System.out.println("Select Network");
        }

        private static void welcomeNote() {
            System.out.println("Welcome");
        }

        private static void callInfoDisplay() {
            System.out.println("Display");
        }

        private static void language() {
            System.out.println("Language");
        }

        private static void callSetting() {
            System.out.println("""
                1: Automatic radial
                2: Speed dialing
                3: Call waiting option
                4: Own number sending
                5: Phone line in use
                6: Automatic answer
                7: back
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1-> automaticRadial();
                case 2-> speedDialling();
                case 3-> callWaitingOption();
                case 4-> ownNumberSending();
                case 5-> phoneLine();
                case 6-> automaticAnswer();
                case 7->Settings();
                default -> callSetting();
            }
        }

        private static void automaticAnswer() {
            System.out.println("Leave a message");
        }

        private static void phoneLine() {
            System.out.println("Phone");
        }

        private static void ownNumberSending() {
            System.out.println("Number Sending");
        }

        private static void callWaitingOption() {
            System.out.println("Waiting for calls");
        }

        private static void speedDialling() {
            System.out.println("Dialing");
        }

        private static void automaticRadial() {
            System.out.println("Redail");
        }

        private static void Tones() {
            System.out.println("""
                Tone
                1: Ringing tone
                2: Ringing volume
                3: Imcoming Call Alert
                4: Composer
                5: Message alert tone
                6: Keypad tone
                7: Warning and game tones
                8: Vibrating alert
                9: Screen saver
                10: back
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1 -> ringingTone();
                case 2 -> ringingVolume();
                case 3 -> imcomingCallAlert();
                case 4 -> composer();
                case 5 -> messageAlertTone();
                case 6 -> keypadTone();
                case 7 -> warningAndGameTones();
                case 8 -> vibratingAlert();
                case 9 -> screenSaver();
                case 10 -> menu();
                default -> Tones();
            }
        }

        private static void screenSaver() {
            System.out.println("Screen Saver");
        }

        private static void vibratingAlert() {
            System.out.println("Vibrating");
        }

        private static void warningAndGameTones() {
            System.out.println("Game tones");
        }

        private static void keypadTone() {
            System.out.println("Keypad Tone");
        }

        private static void messageAlertTone() {
            System.out.println("Message Alert Tone");
        }

        private static void composer() {
            System.out.println("Composer");
        }

        private static void imcomingCallAlert() {
            System.out.println("Call alert");
        }

        private static void ringingVolume() {
            System.out.println("Ringing volume");
        }

        private static void ringingTone() {
            System.out.println("Ringing tone");
        }

        private static void callRegister() {
            System.out.println("""
                Call Register
                1: Missed Calls
                2: Received Calls
                3: Dialed numbers
                4: Erase recent call list
                5: Show call duration
                6: Show call costs
                7: Call cost settings
                8: Prepaid credit
                9: back
                """);
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> missedCalls();
                case 2 -> receivedCalls();
                case 3 -> dialedNumbers();
                case 4 -> eraseRecentCallList();
                case 5 -> showCallDuration();
                case 6 -> showCallCosts();
                case 7 -> callCostSettings();
                case 8 -> prepaidCredit();
                case 9 -> menu();
                default -> callRegister();
            }
        }

        private static void prepaidCredit() {
            System.out.println("Prepaid credit");
        }

        private static void callCostSettings() {
            System.out.println("""
                1: Call cost limit
                2: Show cost in
                3: back
                """);
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> callCostLimit();
                case 2 -> showCallCostsIn();
                case 3 -> callRegister();
                default -> callCostSettings();
            }
        }

        private static void showCallCostsIn() {
            System.out.println("Call cost");
        }

        private static void callCostLimit() {
            System.out.println("Call limit");
        }

        private static void showCallCosts() {
            System.out.println("Call cost");
        }

        private static void showCallDuration() {
            System.out.println("Call duration");
        }

        private static void eraseRecentCallList() {
            System.out.println("Erase Recent Call");
        }

        private static void dialedNumbers() {
            System.out.println("Dialed Numbers");
        }

        private static void receivedCalls() {
            System.out.println("Received calls");
        }

        private static void missedCalls() {
            System.out.println("Missed calls");
        }

        private static void Chat() {
            System.out.println("Chat");
        }

        private static void Messages() {
            System.out.println("""
                Enter:
                1: Write message
                2: Inbox
                3: Outbox
                4: Picture message
                5: Templates
                6: Smileys
                7: Message Settings
                8: Info Service
                9: Voice mailboox number
                10: Service command editor
                11: back
                """);
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> writeMessage();
                case 2 -> inbox();
                case 3 -> outbox();
                case 4 -> pictureMessages();
                case 5 -> templates();
                case 6 -> smileys();
                case 7 -> messageSettings();
                case 8 -> infoService();
                case 9 -> voiceMailBoxNumber();
                case 10 -> serviceCommandEditor();
                case 11 -> exit();
                default -> Messages();
            }
        }

        private static void exit() {
            System.out.println("Byeeee");
        }

        private static void serviceCommandEditor() {
            System.out.println("Service Command Editor");
        }

        private static void voiceMailBoxNumber() {
            System.out.println("Voice Mail");
        }

        private static void infoService() {
            System.out.println("Info Service");
        }

        private static void messageSettings() {
            System.out.println("""
                1: Set
                2: Common
                3: Back
                """);
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> set();
                case 2 -> common();
                case 3 -> Messages();
                default -> messageSettings();
            }
        }

        private static void common() {
            System.out.println("""
                1: Delivery Report
                2: Reply via same centre
                3: Character support
                4: Back
                """);
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> deliveryReport();
                case 2 -> reply();
                case 3 -> characterSupport();
                case 4 -> messageSettings();
                default -> common();
            }
        }

        private static void characterSupport() {
            System.out.println("Character Support");
        }

        private static void reply() {
            System.out.println("Reply");
        }

        private static void deliveryReport() {
            System.out.println("Delivery Report");
        }

        private static void set() {
            System.out.println("""
                1: Message centre number
                2: Message sent as
                3: Message validity
                4: Back
                """);
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> messageCentreNumber();
                case 2 -> messageSentAs();
                case 3 -> messageValidity();
                case 4 -> messageSettings();
                default -> set();
            }
        }

        private static void messageValidity() {
            System.out.println("Message validity");
        }

        private static void messageSentAs() {
            System.out.println("mmmm");
        }

        private static void messageCentreNumber() {
            System.out.println("message");
        }

        private static void smileys() {
            System.out.println("Smileys");
        }

        private static void templates() {
            System.out.println("Templates");
        }

        private static void pictureMessages() {
            System.out.println("Picture Messages");
        }

        private static void outbox() {
            System.out.println("Outbox");
        }

        private static void inbox() {
            System.out.println("Inbox");
        }

        private static void writeMessage() {
            System.out.println("Write Message");
        }



        private static void Phonebook() {
            System.out.println("""
                Enter:
                1:  Search
                2: Servicxe Nos
                3:  Add name
                4:  Erase
                5:  Edit
                6:  Assign tone
                7:  Send bus card
                8:  Options
                9:  Speed dials
                10: Voice tags
                11: Back
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1 -> Search();
                case 2 -> ServiceNo();
                case 3 -> AddName();
                case 4 -> Erase();
                case 5 -> Edith();
                case 6 -> AssignTone();
                case 7 -> SendBusCard();
                case 8 -> Options();
                case 9 -> SpeedDials();
                case 10 -> VoiceTags();
                case 11 -> menu();
                default -> Phonebook();
            }
        }



        private static void VoiceTags() {
            System.out.println("qqqq");
        }

        private static void SpeedDials() {
            System.out.println("aaaaa");
        }

        private static void Options() {
            System.out.println("""
                1: Type of view
                2: Memory status
                3: Back
                """);
            userInput = input.nextInt();
            switch (userInput){
                case 1 -> typeOfView();
                case 2 -> memoryStatus();
                case 3 -> back();
                default -> Options();
            }
        }

        private static void back() {
            Phonebook();
        }

        private static void memoryStatus() {
            System.out.println("1gh");
        }

        private static void typeOfView() {
            System.out.println("fffff");
        }

        private static void SendBusCard() {
            System.out.println("My Card");
        }

        private static void AssignTone() {
            System.out.println("crvbcnesmc");
        }

        private static void Edith() {
            System.out.println("cfswvgbhxjnmewkd");
        }

        private static void Erase() {
            System.out.println("rwgvdbhwnmk,dx");
        }

        private static void AddName() {
            System.out.println("My name");
        }

        private static void ServiceNo() {
            System.out.println("234554");

        }

        private static void Search() {
            System.out.println("Hello");
        }
    }

