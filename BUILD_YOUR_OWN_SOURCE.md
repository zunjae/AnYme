# this page is a work in progress

Due to legal reasons AnYme does not have access to illegal streaming content.

The app still contains a browser

Starting with V12, you can add your own sources to sites such as Crunchyroll

# Step 1
Download the DynamicBrowser class

# Step 2
Import it into a Kotlin project (TODO: provide sample project)

# Step 3
Serialize the file using something like `gson.toJson(yourSite)`

# Step 4
Host the site on a Gist. Can be public or private

# Step 5
Import the Gist in the AnYme app. Make sure you provide a full link, including the commit hash. 

* Example valid link: https://gist.githubusercontent.com/zunjae/aaa/raw/bbb/MyCoolSource.json
* Example invalid link: https://gist.githubusercontent.com/zunjae/aaa/raw/

---

# Doc

| Variable | Description | Example
| --- | --- | --- |
| id:guid | Uniquely identify this site | dcda3351-b7ee-4d70-815f-5d64449a8c65
| name:str | Name of this site | Crunchyroll
| language:list[str] | List of languages supported on this site | listOf("English")
