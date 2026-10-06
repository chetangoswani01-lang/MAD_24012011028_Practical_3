# Practical-3: Implicit and Explicit Intent

## Aim

Create an Android application to demonstrate the use of **Implicit Intent** and **Explicit Intent** for performing different actions and navigating between activities.

---

## Application Demo

### 🎥 Demo Video

[▶️ Watch Demo Video](demo_video.mp4)

---

## 📝 Features Demonstrated

The application demonstrates the following Intent-based operations:

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

An **Implicit Intent** does not specify a particular application or component. Instead, it describes an action that should be performed, allowing Android to select a suitable application to handle the request.

### Web Browse

The following code opens a web page using the default browser:

```kotlin
findViewById<Button>(R.id.btn_Browse).setOnClickListener {
    val url = findViewById<EditText>(R.id.editTextText).text.toString()

    Intent(Intent.ACTION_VIEW, url.toUri()).also {
        startActivity(it)
    }
}
