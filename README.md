<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/mmmelik/RoundedImageView">
    <img src="images/logo.png" alt="Logo" width="150" height="84">
  </a>

  <h3 align="center">RoundedImageView</h3>

  <p align="center">
    Easy to use, lightweight custom image view with rounded corners.
    <br />
    <a href="https://github.com/mmmelik/RoundedImageView"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/mmmelik/RoundedImageView/tree/v1.0.0/app">View Demo</a>
    ·
    <a href="https://github.com/mmmelik/RoundedImageView/issues">Report Bug</a>
    ·
    <a href="https://github.com/mmmelik/RoundedImageView/issues">Request Feature</a>
  </p>
</p>

<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]]()

This library allows you to create pictures with soft edges that are pleasing to the eye.


### Built With

* [Android Studio](https://getbootstrap.com)
* [Java](https://developer.android.com/studio)

<!-- GETTING STARTED -->
## Getting Started

To make this view running on your app follow these simple steps.

### 1. Add the JitPack repository to your project level build.gradle file

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

### 2. Add the dependency to your module level build.gradle file

```gradle
dependencies {
  implementation 'com.github.mmmelik:RoundedImageView:v1.0.0'
}
```

<!-- USAGE EXAMPLES -->
## Usage

`RoundedImageView` extends `ImageView` so all functions of `ImageView` are available for `RoundedImageView`.
In `RoundedImageView` XML attribute ```xml android:adjustViewBounds``` set to **true** by default. If it cause unintended behaviour of the view override with ```xml android:adjustViewBounds="false"```.

### Java
___

```java
RoundedImageView roundedImageView=findViewById(R.id.roundedImageView);
roundedImageView.setRadius(5); //Sets radius of all corners
roundedImageView.setRadius(RoundedImageView.Corner.BOTTOM_LEFT,50); //Override BOTTOM_LEFT corner.
roundedImageView.setImageDrawable(getResources().getDrawable(R.drawable.free)); //First set radius then set drawable.
```


### XML
___

<img align="left" src="images/sc1.png"/>

```xml
<com.appbroker.roundedimageview.RoundedImageView
        android:id="@+id/roundedImageView"
        android:layout_width="wrap_content"
        android:layout_height="150dp"
        android:src="@drawable/free"
        app:radius="50dp"/>
```

<img align="right" src="images/sc2.png"/>

```xml
<com.appbroker.roundedimageview.RoundedImageView
        android:id="@+id/roundedImageView2"
        android:layout_width="wrap_content"
        android:layout_height="150dp"
        android:src="@drawable/free"
        app:topLeftRadius="10dp"
        app:topRightRadius="20dp"
        app:bottomRightRadius="30dp"
        app:bottomLeftRadius="40dp"/>
```

<img align="left" src="images/sc3.png"/>

```xml
<com.appbroker.roundedimageview.RoundedImageView
        android:id="@+id/roundedImageView3"
        android:layout_width="wrap_content"
        android:layout_height="150dp"
        android:src="@drawable/free"
        app:radius="50dp"
        app:bottomRightRadius="0dp"/>
```


<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/mmmelik/RoundedImageView/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Branch
3. Commit your Changes
4. Push to the Branch
5. Open a Pull Request




<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/ss1.png

