package com.techfathers.mechanic_adda.util

import java.io.IOException

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class MyApiException(message: String) : IOException(message)
class NoInternetException(message: String) : IOException(message)
