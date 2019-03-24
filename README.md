# ctestex1
实验一 线性布局 约束布局 表格布局
运行截图
![image](https://github.com/940275947/ctestex1/blob/master/image1/image1.png)
![image](https://github.com/940275947/ctestex1/blob/master/image1/image2.png)
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">

        <Button
            android:id="@+id/btn1"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"

            android:text="One,One"
            android:visibility="visible" />
        <Button
            android:id="@+id/btn2"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1.1"
            android:text="One,Two"/>
        <Button
            android:id="@+id/btn3"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="One,three"/>
        <Button
            android:id="@+id/btn4"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="One,Four"/>
    </LinearLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">
        <Button
            android:id="@+id/btn21"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Two,One"/>
        <Button
            android:id="@+id/btn22"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Two,Two"/>
        <Button
            android:id="@+id/btn23"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Two,Three"/>
        <Button
            android:id="@+id/btn24"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Two,Four"/>
    </LinearLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">
        <Button
            android:id="@+id/btn31"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Three,One"/>
        <Button
            android:id="@+id/btn32"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Three,Two"/>
        <Button
            android:id="@+id/btn33"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Three,Three"/>
        <Button
            android:id="@+id/btn34"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Three,Four"/>
    </LinearLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">
        <Button
            android:id="@+id/btn41"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Four,One"/>
        <Button
            android:id="@+id/btn42"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Four,Two"/>
        <Button
            android:id="@+id/btn43"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Four,Three"/>
        <Button
            android:id="@+id/btn44"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Four,Four"/>
    </LinearLayout>
</LinearLayout>

![image](https://github.com/940275947/ctestex1/blob/master/image1/image3.png)
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/ic_launcher_background"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/button2"
        android:layout_width="111dp"
        android:layout_height="56dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        android:backgroundTint="@color/colorPrimary"
        android:text="Indigo"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button4"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button8"
        android:layout_width="86dp"
        android:layout_height="62dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="32dp"
        android:background="@color/colorPrimary"
        android:text="yellow"
        app:layout_constraintEnd_toStartOf="@+id/button6"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button3"
        android:layout_width="115dp"
        android:layout_height="72dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:backgroundTint="@android:color/holo_red_dark"
        android:text="red"
        app:layout_constraintEnd_toStartOf="@+id/button8"
        app:layout_constraintHorizontal_bias="0.115"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button5"
        android:layout_width="105dp"
        android:layout_height="58dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        android:backgroundTint="@color/colorPrimaryDark"
        android:text="green"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/button4"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button"
        android:layout_width="699dp"
        android:layout_height="84dp"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:backgroundTint="@android:color/holo_purple"
        android:text="VIOLET"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/button6"
        android:layout_width="107dp"
        android:layout_height="65dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="24dp"
        android:backgroundTint="@android:color/holo_orange_light"
        android:text="origin"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button4"
        android:layout_width="111dp"
        android:layout_height="56dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        android:backgroundTint="@color/colorAccent"
        android:text="blue"
        app:layout_constraintBottom_toBottomOf="@+id/button"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</android.support.constraint.ConstraintLayout>

![image](https://github.com/940275947/ctestex1/blob/master/image1/image4.png)
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10px"
    android:background="#7F83CA"
    tools:context=".RelativeLayoutActivity" >

<TableLayout
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:stretchColumns="0"
    android:shrinkColumns="1">

    <TableRow
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView android:text=" Open    "/>
        <TextView android:text="  Ctrl-O"
            android:gravity="right"/>
    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView android:text=" Save   "/>
        <TextView android:text="  Ctrl-s"
            android:gravity="right"/>

    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView android:text=" Save as    "/>
        <TextView android:text="  Ctrl-Shift-S"
            android:gravity="right"/>

    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView android:text=" ×important    "/>
        <TextView android:text="  "
            android:gravity="right"/>

    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView android:text=" ×export    "/>
        <TextView android:text="  Ctrl-E"
            android:gravity="right"/>

    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView android:text=" Quit    "/>
        <TextView android:text="  "
            android:gravity="right"/>

    </TableRow>

</TableLayout>

    </RelativeLayout>
