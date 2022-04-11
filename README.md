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
through which the axis of rotation of the apparatus passes, ie at that point the lasers intersect. 

The goal is always to place the tumor location in an isocenter.

## How it works?

Special Mecanum wheels allow movement in all directions. For example, a prototype first searches for one laser beam, when the first laser beam is detected, then the entire assembly moves to the left. At the moment of detection of the photodiode beam, its corresponding LED lights up. In this way, the accuracy and precision of detection is ensured. 

This mode of movement is not possible with normal wheels used on cars, so special Mecanum wheels are used that allow movement in all directions.

## Circuit
According to the circuit diagram, attach resistors, photodiodes and LEDs ,and hook them up to an Arduino board.

Components used: 
* Arduino UNO
* Photodiode OSRAM PIN SFH203
* LED diodes
* resistors (1kOhm, 100kOhm)
* wires 

## Code

#### Arduino code
Arduino reads data from the photodiode off the Serial port. When the photodiode OSRAM PIN SFH203 detects the laser beam, its corresponding LED lights up.
#### Android app
![android-app](https://github.com/mateax/laser-detection-system/blob/main/android-app-screen.jpg) 

The Arduino reads the commands selected at the touch of a button and controls the servo motors.
By combining the way the servomotor moves, movement is achieved in all directions.

You can find the principle of movement of the Mecanum wheels at this [link](https://www.servomagazine.com/magazine/article/get-rolling-with-omni-directional-wheels).


