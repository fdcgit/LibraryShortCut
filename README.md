# LibraryShortCut

This library will help to assign navigation links with shortcut widget as application is closed. 
Usage is simple, user needs to just long press the application icon and all the shortcuts will be available. 
The user can navigate to the required shortcut.

Here is the implementation snippet code:

Step 1: Add dependencies

build.gradle (Project)
maven { url 'https://jitpack.io' }

build.gradle (App)
implementation 'com.github.fdcgit:LibraryShortCut:29fb546966'

Step 2: Add below code in MainActivity.java Class

ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);

CShortCutData cShortCutData = new CShortCutData();

ShortcutInfo shortcutInfoOne = cShortCutData.createShortCutData(this, "TestOne", R.drawable.ic_launcher_background, "https://www.google.co.in", "Google", "Visit Google");
ShortcutInfo shortcutInfoTwo = cShortCutData.createShortCutData(this, "TestTwo", R.drawable.ic_launcher_background, "https://www.yahoo.com", "Yahoo", "Visit Yahoo");
ShortcutInfo shortcutInfoThree = cShortCutData.createShortCutData(this, "TestThree", R.drawable.ic_launcher_background, "https://www.gmail.com", "Gmail", "Visit Gmail");
ShortcutInfo shortcutInfoFour = cShortCutData.createShortCutData(this, "TestFour", R.drawable.ic_launcher_background, "https://www.youtube.com", "Youtube", "Visit Youtube");

shortcutManager.setDynamicShortcuts(
        Arrays.asList(
                shortcutInfoOne,
                shortcutInfoTwo,
                shortcutInfoThree,
                shortcutInfoFour
        )
);
