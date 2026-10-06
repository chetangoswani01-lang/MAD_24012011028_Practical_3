# Practical 3: Implicit and Explicit Intent

## Aim

Develop an Android application that demonstrates the use of implicit and explicit Intent.

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

Implicit intents allow the application to request an operation from another application on the device without directly specifying which application will perform it.

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
