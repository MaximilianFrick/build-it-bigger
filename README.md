# Gradle for Android and Java Final Project

Fourth project of Android Developer Nanodegree course (Udacity).
This project contains an app with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. It consist
of four modules. A Java library that provides jokes, a Google Cloud Endpoints
(GCE) project that serves jokes, an Android Library containing an
activity for displaying jokes, and an Android app that fetches jokes from the
GCE module and passes them to the Android Library for display.

## In a nutshell

* Added free and paid flavors to an app, and set up the build to share code between them
* Reusable functionality into a Java library
* Reusable Android functionality into an Android library
* Configured a multi project build to compile given libraries and app
* Used the Gradle App Engine plugin to deploy a backend
* Configured an integration test suite that runs against the local App Engine development server

## License
```
Copyright 2016 Maximilian Frick

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
