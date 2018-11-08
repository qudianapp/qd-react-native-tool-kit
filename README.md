# qd-react-native-tool-kit
useful tools for native ability
## Getting started

`$ npm install @qudian_mobile/qd-react-native-tool-kit --save`

### Manual installation


#### Android

1. Append the following lines to `android/settings.gradle`:
    ```
    include ':qd-react-native-tool-kit'
    project(':qd-react-native-tool-kit').projectDir = new File(rootProject.projectDir,  '../node_modules/@qudian_mobile/qd-react-native-tool-kit/android')
    ```
2. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
    ```
    implementation project(':qd-react-native-tool-kit')
    ```
3. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.qudian.qd_react_native_tools_kit.QDReactToolKitPackage;` to the imports at the top of the file
  - Add `new QDReactToolKitPackage()` to the list returned by the `getPackages()` method
4. copy your app/res/mipmap folder to qd-react-native-tool-kit/res/

## Usage
### DownloadHelper
```javascript
import { DownloadHelper } from '@qudian_mobile/qd-react-native-tool-kit';

DownloadHelper.download(url);
```
### Dimensions
```javascript
import { StyleSheet } from 'react-native';
import { Dimensions } from '@qudian_mobile/qd-react-native-tool-kit';
const { W, PIXEL, SCREEN_HEIGHT, SCREEN_WIDTH } = Dimensions;

const styles = StyleSheet.create({
    test: {
        width: W(28),
        height: W(32),
    },
    test1: {
        width: SCREEN_WIDTH,
        height: PIXEL,
    }
})
```


