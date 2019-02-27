
# react-native-threeegg

## Getting started

`$ npm install react-native-threeegg --save`

### Mostly automatic installation

`$ react-native link react-native-threeegg`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-threeegg` and add `RNThreeegg.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNThreeegg.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.zxx.three.egg.RNThreeeggPackage;` to the imports at the top of the file
  - Add `new RNThreeeggPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-threeegg'
  	project(':react-native-threeegg').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-threeegg/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-threeegg')
  	```


## Usage
```javascript
import RNThreeegg from 'react-native-threeegg';

// TODO: What to do with the module?
RNThreeegg;
```
  