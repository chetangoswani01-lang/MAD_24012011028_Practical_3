# Practical 3: Implicit and Explicit Intent

## Aim

Create an Android application which demonstrates implicit and explicit Intent.

---

## Application Demo

|   |
| - |

### 🎥 Demo

demo_video.mp4 [video](YOUR_OWN_VIDEO_LINK_HERE)

|   |
| - |

### 📝 Steps

1. **Web Browse**
2. **Phone Call**
3. **Call Log**
4. **Gallery**
5. **Camera**
6. **Set Alarm**
7. **Login Navigation**

---

## Application Logic

### 1. Implicit Intent

Implicit intents allow the app to request an action from another app on the device without knowing which app will handle it.

```kotlin
// Browsing a URL
findViewById<Button>(R.id.btn_Browse).setOnClickListener {
    val url = findViewById<EditText>(R.id.editTextText).text.toString()
    Intent(Intent.ACTION_VIEW, url.toUri()).also {
        startActivity(it)
    }
}

// Opening Dialer with a Number
findViewById<Button>(R.id.btn_Call).setOnClickListener {
    val number = findViewById<EditText>(R.id.editTextText2).text.toString()
    Intent(Intent.ACTION_DIAL).apply {
        data = "tel:$number".toUri()
    }.also {
        startActivity(it)
    }
}
###Action View: Used for browsing web content.
###Action Dial: Opens the dialer with the provided phone number using tel: URI.
// Setting an Alarm
findViewById<Button>(R.id.btn_Alarm).setOnClickListener {
    Intent(AlarmClock.ACTION_SET_ALARM).apply {
        putExtra(AlarmClock.EXTRA_HOUR, 7)
        putExtra(AlarmClock.EXTRA_MINUTES, 30)
        putExtra(AlarmClock.EXTRA_MESSAGE, "Wake Up")
    }.also {
        startActivity(it)
    }
}
###AlarmClock: Uses extras like EXTRA_HOUR and EXTRA_MINUTES to configure the system alarm.
###2. Explicit Intent
###Explicit intents are used to start a specific component (like an Activity) within your own application.
// Navigating to LoginActivity
findViewById<Button>(R.id.btn_Login).setOnClickListener {
    Intent(this, LoginActivity::class.java).also {
        startActivity(it)
    }
}
UI Details
Main Activity (activity_main.xml)

The main screen uses a ConstraintLayout to organize various interactive elements:

Inputs: EditText fields for URL and Phone Number entry.
Actions: Buttons for Browse, Call, Call Log, Gallery, Camera, Alarm, and Login.
Layout: Uses constraints like layout_constraintBaseline_toBaselineOf to align labels with their respective buttons/inputs for a clean look.
Login Activity (activity_login.xml)

A modern login interface featuring:

Logo: University logo at the top using ImageView.
Card View: MaterialCardView for a elevated container holding the login form.
Form: Email and Password inputs with a "Login" button and "Forgot Password" link.
