package com.example.lasalleapp.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null

public val Task: ImageVector
    get() {
        if (_Task != null) {
            return _Task!!
        }
        _Task = ImageVector.Builder(
            name = "Task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(438f, 720f)
                lineToRelative(226f, -226f)
                lineToRelative(-58f, -58f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(280f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                close()
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        return _Task!!
    }

private var _Task: ImageVector? = null

public val CashCoin: ImageVector
    get() {
        if (_CashCoin != null) {
            return _CashCoin!!
        }
        _CashCoin = ImageVector.Builder(
            name = "CashCoin",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                moveToRelative(5f, -4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(9.438f, 11.944f)
                curveToRelative(0.047f, 0.596f, 0.518f, 1.06f, 1.363f, 1.116f)
                verticalLineToRelative(0.44f)
                horizontalLineToRelative(0.375f)
                verticalLineToRelative(-0.443f)
                curveToRelative(0.875f, -0.061f, 1.386f, -0.529f, 1.386f, -1.207f)
                curveToRelative(0f, -0.618f, -0.39f, -0.936f, -1.09f, -1.1f)
                lineToRelative(-0.296f, -0.07f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.376f, 0.043f, 0.614f, 0.248f, 0.671f, 0.532f)
                horizontalLineToRelative(0.658f)
                curveToRelative(-0.047f, -0.575f, -0.54f, -1.024f, -1.329f, -1.073f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(-0.375f)
                verticalLineToRelative(0.45f)
                curveToRelative(-0.747f, 0.073f, -1.255f, 0.522f, -1.255f, 1.158f)
                curveToRelative(0f, 0.562f, 0.378f, 0.92f, 1.007f, 1.066f)
                lineToRelative(0.248f, 0.061f)
                verticalLineToRelative(1.272f)
                curveToRelative(-0.384f, -0.058f, -0.639f, -0.27f, -0.696f, -0.563f)
                horizontalLineToRelative(-0.668f)
                close()
                moveToRelative(1.36f, -1.354f)
                curveToRelative(-0.369f, -0.085f, -0.569f, -0.26f, -0.569f, -0.522f)
                curveToRelative(0f, -0.294f, 0.216f, -0.514f, 0.572f, -0.578f)
                verticalLineToRelative(1.1f)
                close()
                moveToRelative(0.432f, 0.746f)
                curveToRelative(0.449f, 0.104f, 0.655f, 0.272f, 0.655f, 0.569f)
                curveToRelative(0f, 0.339f, -0.257f, 0.571f, -0.709f, 0.614f)
                verticalLineToRelative(-1.195f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4.083f)
                quadToRelative(0.088f, -0.517f, 0.258f, -1f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(3.528f)
                curveToRelative(0.38f, 0.34f, 0.717f, 0.728f, 1f, 1.154f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(9.998f, 5.083f)
                lineTo(10f, 5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.132f, 1.65f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.13f, -1.567f)
            }
        }.build()
        return _CashCoin!!
    }

private var _CashCoin: ImageVector? = null


public val UserRound: ImageVector
    get() {
        if (_UserRound != null) {
            return _UserRound!!
        }
        _UserRound = ImageVector.Builder(
            name = "UserRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(17f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
            }
        }.build()
        return _UserRound!!
    }

private var _UserRound: ImageVector? = null

public val CalendarDays: ImageVector
    get() {
        if (_CalendarDays != null) {
            return _CalendarDays!!
        }
        _CalendarDays = ImageVector.Builder(
            name = "CalendarDays",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 2f)
                verticalLineToRelative(4f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16f, 2f)
                verticalLineToRelative(4f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5f, 4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(3f, 10f)
                horizontalLineToRelative(18f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 18f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 18f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16f, 18f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        return _CalendarDays!!
    }

private var _CalendarDays: ImageVector? = null

public val Attach_email: ImageVector
    get() {
        if (_Attach_email != null) {
            return _Attach_email!!
        }
        _Attach_email = ImageVector.Builder(
            name = "Attach_email",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(440f, 440f)
                lineTo(120f, 240f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(320f, -200f)
                horizontalLineTo(120f)
                close()
                moveTo(760f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                reflectiveQuadToRelative(71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                reflectiveQuadToRelative(56.5f, -23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 880f)
                moveTo(120f, 240f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        return _Attach_email!!
    }

private var _Attach_email: ImageVector? = null


public val Lock_person: ImageVector
    get() {
        if (_Lock_person != null) {
            return _Lock_person!!
        }
        _Lock_person = ImageVector.Builder(
            name = "Lock_person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(720f, 720f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(780f, 660f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(720f, 600f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(660f, 660f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(720f, 720f)
                moveToRelative(0f, 120f)
                quadToRelative(30f, 0f, 56f, -14f)
                reflectiveQuadToRelative(43f, -39f)
                quadToRelative(-23f, -14f, -48f, -20.5f)
                reflectiveQuadToRelative(-51f, -6.5f)
                reflectiveQuadToRelative(-51f, 6.5f)
                reflectiveQuadToRelative(-48f, 20.5f)
                quadToRelative(17f, 25f, 43f, 39f)
                reflectiveQuadToRelative(56f, 14f)
                moveTo(360f, 320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                reflectiveQuadToRelative(-85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                close()
                moveTo(490f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 40f)
                reflectiveQuadToRelative(141.5f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(52f)
                quadToRelative(-18f, -6f, -37.5f, -9f)
                reflectiveQuadToRelative(-42.5f, -3f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(212f)
                quadToRelative(8f, 24f, 16f, 41.5f)
                reflectiveQuadTo(490f, 880f)
                moveToRelative(230f, 40f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                reflectiveQuadToRelative(58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                reflectiveQuadToRelative(141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                reflectiveQuadTo(861.5f, 861.5f)
                reflectiveQuadTo(720f, 920f)
                moveTo(240f, 400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        return _Lock_person!!
    }

private var _Lock_person: ImageVector? = null


public val Palette: ImageVector
    get() {
        if (_Palette != null) {
            return _Palette!!
        }
        _Palette = ImageVector.Builder(
            name = "Palette",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 880f)
                quadToRelative(-82f, 0f, -155f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                reflectiveQuadToRelative(-86f, -127.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 32.5f, -156f)
                reflectiveQuadToRelative(88f, -127f)
                reflectiveQuadTo(330f, 111.5f)
                reflectiveQuadTo(488f, 80f)
                quadToRelative(80f, 0f, 151f, 27.5f)
                reflectiveQuadToRelative(124.5f, 76f)
                reflectiveQuadToRelative(85f, 115f)
                reflectiveQuadTo(880f, 442f)
                quadToRelative(0f, 115f, -70f, 176.5f)
                reflectiveQuadTo(640f, 680f)
                horizontalLineToRelative(-74f)
                quadToRelative(-9f, 0f, -12.5f, 5f)
                reflectiveQuadToRelative(-3.5f, 11f)
                quadToRelative(0f, 12f, 15f, 34.5f)
                reflectiveQuadToRelative(15f, 51.5f)
                quadToRelative(0f, 50f, -27.5f, 74f)
                reflectiveQuadTo(480f, 880f)
                moveTo(260f, 520f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                reflectiveQuadToRelative(-17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                reflectiveQuadToRelative(-43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                reflectiveQuadToRelative(17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                moveToRelative(120f, -160f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                reflectiveQuadToRelative(-17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                reflectiveQuadToRelative(-43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                reflectiveQuadToRelative(17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                moveToRelative(200f, 0f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                reflectiveQuadToRelative(-17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                reflectiveQuadToRelative(-43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                reflectiveQuadToRelative(17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                moveToRelative(120f, 160f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                reflectiveQuadToRelative(-17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                reflectiveQuadToRelative(-43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                reflectiveQuadToRelative(17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                moveTo(480f, 800f)
                quadToRelative(9f, 0f, 14.5f, -5f)
                reflectiveQuadToRelative(5.5f, -13f)
                quadToRelative(0f, -14f, -15f, -33f)
                reflectiveQuadToRelative(-15f, -57f)
                quadToRelative(0f, -42f, 29f, -67f)
                reflectiveQuadToRelative(71f, -25f)
                horizontalLineToRelative(70f)
                quadToRelative(66f, 0f, 113f, -38.5f)
                reflectiveQuadTo(800f, 442f)
                quadToRelative(0f, -121f, -92.5f, -201.5f)
                reflectiveQuadTo(488f, 160f)
                quadToRelative(-136f, 0f, -232f, 93f)
                reflectiveQuadToRelative(-96f, 227f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
            }
        }.build()
        return _Palette!!
    }

private var _Palette: ImageVector? = null




