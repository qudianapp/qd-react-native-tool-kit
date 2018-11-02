import { NativeModules } from 'react-native';

const DownloadHelper = NativeModules.QDDownloadManager;

function download(url) {
    if (!DownloadHelper) {
        return;
    }
    DownloadHelper.download(url);
}

export default {
    download,
}