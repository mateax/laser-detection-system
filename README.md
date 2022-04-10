# laser-detection-system
Laser detection system for patient positioning system during radiotherapy

#### Start position:
![start-position](https://github.com/mateax/laser-detection-system/blob/main/final-prototype/start-position.jpg)

#### First laser detection:
![first-laser-detection](https://github.com/mateax/laser-detection-system/blob/main/final-prototype/first-laser-detection.jpg)

#### Second laser detection - final position:
![second-laser-detection](https://github.com/mateax/laser-detection-system/blob/main/final-prototype/second-laser-detection.jpg)


## What it is?
This is a prototype laser beam detector with Mecanum wheels that allow movement in all directions. This prototype device can be used in radiotherapy patient positioning systems where it is necessary to find the intersection of multiple laser beams that represent the isocenter. 

**Isocentre** is an imaginary point in the space around which the moving parts of the device revolve and represents the center of the tumor
through which the axis of rotation of the apparatus passes, ie at that point the lasers intersect. The goal is always to place the tumor location in an
isocenter.

## How it works?

*napiši kako mu mecanum kotači omogućuju gibanje u svim smjerovima
*prvo se detektira prva zraka za tim se detektira druga zraka


## Circuit
According to the circuit diagram, attach the HC–SR04 Ultrasonic Sensor to a servo motor,and hook them up to an Arduino board. *potrebno je spojiti diode te i te

*pobroji komponente

Components used: 
* Arduino UNO
* HC-SR04 Ultrasonic Sensor
* Servo motor SG-90
* wires 

## Code

*objasni kod za aplikaciju i za kretanje
#### Arduino code
Sweeps the servo back and forth in the range od 180 degrees.
After every step, it will read the distance off the ultrasonic sensor and write the value to Serial.
#### Processing code
Listens for "readings" (off the Serial port) from the Arduino and plots the result with simple graphics.

You can read more about Processing [here](https://processing.org/).
