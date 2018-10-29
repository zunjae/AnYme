# AnYme
Android App for Anime which can sync with MyAnimeList **[ FREE AND NO ADS! ]**

[CLICK HERE TO DOWNLOAD THE APP](https://github.com/zunjae/anyme_download/releases/download/DownloadLink/anYme.apk)

![image](https://cdn.discordapp.com/attachments/341672347746697216/492282508130517002/153743965881301.png)

[Join the Discord server to get app updates earlier](http://anymeapp.com/serverinvite)


# App Features

* **Synchronize with MyAnimeList to update what episodes you have watched!**
* **A Built-in AdBlocker** which blocks annoying ads and trackers
* **Get a notification when an episode is released**
* Find Similar and Related Anime from shows you're watching
* Read information about anime movies and anime shows
     * This includes information such as **score, rating, broadcast day, adaptions, sequels etc.**
* **See recommendations** based on shows you like
* See a list of **all popular, ongoing and airing anime shows, movies and OVAs**
* **Add notes** to episodes you have watched
* Save a list of your **favorite anime characters**
* Find which characters play in a show and who their voice actors are.
* Don't know what to watch? Use the **Random Anime button**
* Cleanup your MyAnimeList profile
* **Bulk delete shows** from your profile
* Quickly see how long it takes before the next episode airs
* See the **schedule** of your favorite Anime
* **Skip opening music** for an Anime
* Search for shows based on **filters**
* Find anime wallpapers from your favorite show and **batch-download** them
* Look up **anime songs** and listen to them
* Find **anime discussions** on Reddit


and more...


## Things you should know

* **AnYme requires no app permission**. So it can't look at your private files and send them to a server
* You need at least Android 4.4
* You can request new features on [Reddit](https://www.reddit.com/r/AnYme) or the [Discord server](http://anymeapp.com/serverinvite)
* AnYme uses **HTTPS** when connecting to MAL. When creating a MAL account, I recommend you pick a password you do not use anywhere else
* You can login or register on Kanon through https://kanonapp.com/account/register on your phone
* AnYme is a MyAnimeList app. Other sources will not be added
* Please report ads. I can block them fairly easily.

## Credits (alphabetically):

* [ButterKnife](http://jakewharton.github.io/butterknife/)
* [Fabric](https://docs.fabric.io/android/fabric/overview.html)
* [FancyButtons](https://github.com/medyo/Fancybuttons)
* [FastScroll](https://github.com/L4Digital/FastScroll)
* [FloatingActionButtonSpeedDial](https://github.com/leinardi/FloatingActionButtonSpeedDial)
* [FontAwesome](http://fontawesome.io/)
* [Glide](https://github.com/bumptech/glide)
* [Jikan.moe](https://jikan.moe/)
* [MaterialDialogs](https://github.com/afollestad/material-dialogs)
* [MaterialDrawer](https://github.com/mikepenz/MaterialDrawer)
* [MaterialFavoriteButton](https://github.com/IvBaranov/MaterialFavoriteButton)
* [MaterialSearchView](https://github.com/MiguelCatalan/MaterialSearchView)
* [Otto](http://square.github.io/otto/)
* [Retrofit](http://square.github.io/retrofit/)
* [Room](https://developer.android.com/topic/libraries/architecture/room)
* [TagView](https://github.com/Cutta/TagView)

Other

* App Icon: LouieK22

# How is AnYme build?

AnYme is a native Android application written in Java using Android Studio. It mostly consist of the [Architecture Components](https://developer.android.com/topic/libraries/architecture/) from Google. The components consist of libraries which help me create robust code for the app while still being backwards comptible up to Android 4.4. Here are some example usages in the app:

## LiveData and ViewModel

The LiveData component is used to update the user interface whenever a change happens in the database without having to manually pull the database or fully recreate the screen you're on. LiveData in conjuction with ViewModels also helps prevents any issues that come with configuration changes, such as needing to re-query the database after rotating your device.

![Image](https://cdn.discordapp.com/attachments/341672347746697216/497744107557355520/Screen_Shot_2018-10-05_at_14.17.04.png)

## Room

[Room](https://developer.android.com/topic/libraries/architecture/room) is a wrapper for SQLite which allows me to do fancy selections over the dataset. All I have to do is annotate my existing models and Room will automatically create an abstraction layer for me. The great thing about Room is that it checks at compile time whether my queries are correct. Here is an example code for how I retrieve the users' top shows while still allowing a variable minimum score:

![Image](https://cdn.discordapp.com/attachments/341672347746697216/497743744792264724/Screen_Shot_2018-10-05_at_13.52.50.png)

## WorkManager

I use WorkManager to create tasks for code that needs to be executed in the background. I also make sure to only run it under specific conditions. For example: your profile will be updated upon app startup but only if you're connected to the internet. WorkManager guarantees that the task is only executed when possible. Here is how I update a profile:

![Image](https://cdn.discordapp.com/attachments/341672347746697216/497743739276754954/Screen_Shot_2018-10-05_at_14.13.43.png)


