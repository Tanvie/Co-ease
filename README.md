# Co-ease

Google sheet Link: https://docs.google.com/spreadsheets/d/1vhevRpCGGGUjZ7rHDsCPbpQf9dCs08dYR8NWZE2VyrM/edit?usp=sharing
Published sheet: https://docs.google.com/spreadsheets/d/e/2PACX-1vQzFY2IiW0YIpF3olD__XKCJnUhB_rSzWAKo37XtJZTdJPn9H15wy5zQjv8JPtlIk43qOZNNXK7NAyF/pubhtml


# Title of the Project

CO-EASE

# Description

Due to this pandemic, healthcare workers are at constant risk of getting infected with Covid-19. With the help of the latest technology, the Internet of things, we can reduce this risk by implementing , Co-ease in the covid centres which collects and monitors data such as oxygen level, pulse rate and body temperature of patients without being in close contact with them. High-risk patients' data will be highlighted and provided to the concerned doctors.

# Hardware Requirements

1. RFID cards are provided to each bed for the unique identification of the patient.
2. RFID Scanner is used for scanning RFID cards.  
3. Pulse oximeter sensor is reading oxygen level and pulse rate of patient and sending data to NodeMCU for further processing.
4. The Temperature sensor is reading the body temperature of the patient.
5. NodeMCU, used as a microcontroller, is responsible for reading real-time data from both sensors and sending it to  Google Sheet.

# Software Requirements

1. Google sheets for logging and fetching the patients data in an android application.
2. The Android app to highlight high-risk patients and help doctors to diagnose them easily. 
3. Eagle software for the PCB design for the prototype
4. Solidworks software to demonstrate the final look of the Co-ease kit.

# Process Flow

In hardware side,
1. The patient has to scan the RFID card onto the RFID receiver and it will detect his bed number and the same will be displayed on LCD for confirmation.
2. The instructions for further processing will be displayed on the LCD screen.
3. When the LCD screen displays “Test for oxygen level and pulse rate”, the patient has to touch the pulse oxygen sensor and it will detect his oxygen level and pulse rate. 
4. This reading  will be displayed  on the LCD screen.
5. Again LCD will prompt patient for similar steps for detecting body temperature of patient with help of temperature, and will display it on LCD.
6. In case patients reading doesn't seem normal, the Red LED, on module will start glowing and thereby immediately alert the patient.

In software side,
1. Application interface will be displaying data of all patients in Covid center and doctors can monitor each of them remotely.
2. High risk patients will be highlighted. 


