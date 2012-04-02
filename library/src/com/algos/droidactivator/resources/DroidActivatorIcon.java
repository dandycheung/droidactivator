/*
 * This file is part of DroidActivator.
 * Copyright (C) 2012 algos.it
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.algos.droidactivator.resources;

import android.graphics.drawable.Drawable;


public class DroidActivatorIcon  {

	private static byte[] getBytes() {
		byte[] buffer = { -119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 113, 0, 0, 0, 17, 8,
				6, 0, 0, 0, -22, -118, 67, -118, 0, 0, 0, 4, 115, 66, 73, 84, 8, 8, 8, 8, 124, 8, 100, -120, 0, 0, 7,
				-26, 73, 68, 65, 84, 88, -123, -19, -104, 123, 108, -43, 103, 25, -57, 63, -49, -71, -12, 58, -18, 101,
				-108, 82, -32, 28, 122, 10, -116, -59, 63, 84, 22, -26, -100, -69, 16, -47, 69, 98, 50, -29, 34, 10,
				97, -13, 50, 18, -30, -36, -52, -100, -122, -103, -96, 113, -53, -122, 102, -119, 56, -125, -105, 100,
				99, -127, -60, 11, -37, -108, 25, -108, -55, -112, 101, 19, -77, -55, -100, 64, 52, -88, 40, 20, -54,
				-38, -45, 110, -91, -36, 57, -48, -10, -76, -25, -9, -11, -113, -9, 57, -19, -81, -43, 98, 28, 9, -4,
				-45, 39, 57, -55, -7, -67, -17, -13, 60, -17, -9, -71, -66, -49, -17, 103, -116, 66, -7, -36, -116, 70,
				-84, 98, 11, 104, -114, 89, 116, -49, -116, 67, 109, 47, -113, -58, 59, 70, 87, -105, 18, -93, 111, 85,
				124, 0, -72, 17, -84, 65, 81, 98, -91, -64, -82, 24, -86, 49, -6, -65, 104, 88, 16, 15, -25, 114, -107,
				-121, 115, 84, 2, 40, -118, -46, 72, -27, -3, 74, 3, 1, 8, -110, 87, 24, -29, 24, -3, 15, 26, 12, 98,
				71, -74, 97, 94, 21, -91, -115, -43, -106, -7, 113, -5, -36, -58, 25, -62, 20, 103, -4, 22, 36, 58,
				115, -103, -113, 118, 54, 101, -42, 117, 52, 103, -105, 92, 113, -92, 99, 52, 42, 25, 64, 107, 38, 51,
				49, -99, 98, 43, 102, -117, 1, 34, 69, -9, -91, 44, -39, 21, 41, 122, 30, -77, 4, -24, 89, -44, -1, 53,
				44, -67, 11, 108, 62, -46, -23, 1, -76, 52, -45, -14, -42, -98, -85, 11, 127, -116, 0, 82, 123, 33,
				-99, 78, -39, 90, -116, -59, -66, 86, 80, 73, -19, 81, 82, -43, 113, 70, -11, -102, -84, -54, 6, 48,
				-64, 108, 82, 26, 123, -92, 53, -109, -7, 84, -10, -40, -79, 51, 0, -110, 110, 4, 38, -32, 109, -41,
				-23, 52, -48, 98, 102, -89, 47, 23, -88, -92, -108, -103, 13, 92, 98, -1, -3, -64, 84, 96, -73, -103,
				-11, -8, -38, 120, 96, 30, 48, 5, -120, -100, 53, 1, -100, 7, -2, 116, 41, 125, -17, 22, -57, -43, -96,
				-60, -76, -90, -58, -39, -104, 62, 81, 94, -112, -94, -51, -35, -83, 109, 47, 41, -118, 82, -125, 92,
				-62, 102, -26, -13, 29, -119, -124, -66, 97, 48, 0, 16, -63, -94, 84, 66, 55, 5, 25, -91, -128, 31, 0,
				47, 1, 59, 99, -65, 55, -127, -67, 82, -32, 123, -73, 36, -87, 22, -40, -28, -127, 26, -115, -66, 9,
				-20, 0, -90, -69, -52, 45, -64, 63, 29, -61, -114, 24, -90, 29, -114, -75, -10, 18, -25, 85, 75, -102,
				37, -115, 72, 100, -87, 10, -40, 44, -23, -125, -105, 97, 14, -110, 18, -110, 102, 72, -86, -105, 116,
				-39, 3, 99, 10, 75, -83, 68, 76, -57, -64, -48, 65, 37, 74, -33, 89, 8, -3, -19, 73, -122, -43, -108,
				-64, 56, 116, 108, 91, 71, 115, 102, 35, -40, 106, -125, -15, 81, -126, 15, 43, 56, -91, 4, 124, 27,
				-104, 22, -45, 109, 64, 14, 88, 6, -68, 32, 105, -87, -103, -19, 83, 24, -106, -90, 17, -86, -93, 10,
				104, 51, -77, -29, -110, -46, 64, 3, -95, -102, 1, 78, 2, -99, 102, 38, -96, -58, 101, 26, -127, 125,
				-18, -120, 58, -96, -98, 48, 104, 29, 32, 84, -102, -62, -106, -22, -128, -115, 46, -73, 1, -8, -121,
				-29, -119, -128, -121, -29, -106, 73, -102, -24, 122, -86, 8, 85, -38, 13, -52, 7, -98, 5, 30, -109,
				-12, 42, 112, -62, -52, -14, -124, -64, 79, 0, 26, 36, -43, 3, -77, -127, 86, 51, 59, 30, -45, -107, 3,
				58, -52, -20, 109, 73, 51, -127, 58, 63, -49, -128, 11, 64, 43, 48, 30, -8, 29, 80, 4, 86, 75, -70, 8,
				-4, -53, -52, -118, -82, 103, 2, 33, 25, -85, -127, -117, -18, -121, -13, 49, -52, 53, -18, -117, 90,
				-96, -121, 124, 115, -26, -9, -7, -26, -84, -62, 47, -13, 100, -103, -15, -83, 57, -77, 110, -50, -25,
				-78, -89, -14, -51, -39, 40, -33, -100, 125, -76, -68, -34, -34, -108, -71, 35, -97, -53, 94, -52, 55,
				103, -43, -98, -53, -18, -40, -37, -48, 80, -61, 37, 72, -46, -35, -110, -6, 36, 61, -30, 25, -72, 92,
				-46, 81, 13, -47, 67, -110, -52, -9, 79, -58, -42, -33, -106, 116, -65, -92, -92, -92, 113, -110, 110,
				119, -89, 32, 105, -95, -92, -65, 72, -118, 36, -99, -107, 52, 95, -46, 22, 127, -50, 74, 90, 37, -87,
				95, -46, 67, 35, -80, -92, 36, -19, -111, -76, 95, -46, 4, 73, -77, 37, -19, -42, 112, -6, -71, -92,
				69, -110, 10, -79, -75, 77, 46, 63, 78, -46, 109, 94, -91, 119, -7, 121, 79, -57, -12, -81, 119, 91,
				87, -8, -13, 79, 71, -24, -18, -107, -12, 101, 73, 117, -110, 90, 98, -21, -35, -110, -102, 93, -26,
				38, 73, -81, 75, 42, -6, 94, 81, -46, 46, 73, 115, 125, 127, -114, -92, -99, -82, 75, -110, 14, -92,
				32, -68, 82, 4, 6, -50, -108, -1, 23, -114, -74, -67, 121, 77, 46, 123, 79, 10, -43, 69, 61, 3, -37, 6,
				61, 97, 3, 61, 70, -70, 95, 80, 109, 70, 122, 86, 127, -1, 37, -34, 53, 1, 56, 8, -100, 3, 38, 2, -41,
				1, -33, 37, 84, -18, 51, -124, 44, 123, 3, 88, 13, -84, 33, 84, -44, -49, 92, 110, 9, -80, 30, -24, 0,
				90, -128, -19, -64, -93, -18, -76, 13, 64, 19, -95, 90, -114, 2, 93, -64, 80, -5, -121, -71, 64, -127,
				-112, -19, 113, 50, -122, 38, -14, 10, -32, 41, -32, 6, -32, 87, -64, 17, -33, 123, -125, 80, -63, 6,
				-4, 26, 56, 12, -68, -26, 50, 77, -64, 47, -127, 31, 17, 90, -14, 65, 96, -79, 39, 87, 26, -8, 60, -16,
				55, -25, 1, -40, 6, -100, -59, 59, 4, -16, 113, -32, -77, -64, 47, 8, 93, -95, 11, -40, 66, -104, 29,
				78, 42, 116, -112, -17, 1, 11, 28, -45, 49, 66, 87, -8, 8, -80, 94, -46, 103, -36, 127, -73, 2, -69,
				-4, -4, -114, 20, -48, -119, 20, 97, -106, 72, 64, -77, -64, 12, 116, 61, 20, 105, 105, -3, -51, -56,
				-120, 68, -92, 103, 26, -86, 5, 3, 113, 122, 106, 119, 119, -33, 72, -98, 17, -108, 116, -25, 20, -127,
				91, -128, 107, -127, 21, 110, -120, 8, 45, -29, 97, -32, -124, -81, -73, -72, -36, 29, -50, -13, 33,
				119, 100, -91, -21, -86, 119, -61, -10, 0, 95, 0, -6, -52, 44, 82, 104, -57, 101, -22, -13, 32, 84, 50,
				58, -43, 1, -17, 117, 61, -97, -58, -17, 122, -57, -12, 49, -1, -1, 19, -32, 5, -122, -38, -81, 17,
				-110, -59, -4, 10, 120, 2, -40, 4, 44, 7, 122, -127, 113, -64, 115, 102, -42, 39, -23, 102, 66, 98,
				-114, 115, -39, 31, -70, 61, -53, -128, 107, 92, 103, 30, 88, 11, -12, -72, 13, 11, 8, 9, -72, 3, 88,
				-23, -104, -110, -124, 100, -70, 21, -56, 18, 2, -68, 15, -72, -105, -48, -6, -107, -120, -92, 23, -63,
				-50, 1, -56, 108, 73, 71, 46, -77, 104, 52, -85, 15, 79, -98, 60, 62, 101, -36, -115, 89, 18, -87, 36,
				-76, -41, -96, 31, 64, 82, -91, -92, -86, 17, -65, 58, -32, 46, -62, 29, 112, -44, -99, 26, 17, 122,
				124, -55, -52, 34, 119, 74, 13, -31, 78, 106, 32, 84, 72, -102, 112, 7, -106, -125, 31, -89, -56, -115,
				-85, 33, -36, 9, 21, 30, -64, 120, 71, -40, -29, -5, -9, 75, -102, 86, -58, -58, -16, -81, 78, 37, -41,
				83, -21, -8, 42, 24, 74, -108, 11, -66, -65, -124, 112, 7, 86, 74, 26, 49, 37, 0, 97, 80, -6, 59, -80,
				-118, -112, 80, -25, -127, -99, 10, 3, -47, 87, -128, -9, 0, 111, -69, -19, 5, -122, -122, 41, 1, 61,
				110, 99, 19, -112, -106, 84, -31, 24, -52, -49, 28, -17, 126, -88, -13, -25, -94, -37, 110, -64, 113,
				-96, 96, 102, -111, -103, 41, 85, 84, -17, -10, 74, -85, 121, -48, 66, -69, -101, 106, -40, -122, -50,
				57, 13, -97, 108, 56, -38, -39, 22, 71, -37, -34, -40, 88, 77, 85, -14, 113, -92, -59, -104, -127, -15,
				78, 74, -47, 118, 15, 96, -126, -48, 98, -82, 99, 120, -42, 78, -9, -64, -4, 21, -40, 74, 104, 37,
				-116, 112, 120, -71, -43, 76, 118, -98, 22, 7, -97, 115, -89, -18, -116, -15, 27, -95, -67, 30, 32, 84,
				-24, 31, -35, -96, 8, -72, 62, 118, -10, -53, -66, -73, -100, 80, -3, 121, 15, -50, 106, 66, -32, -46,
				46, -9, 103, 96, 41, -80, 31, 104, 119, 39, -2, 22, 120, -116, 48, -128, 124, 14, -72, -51, -125, -13,
				125, 96, 111, 12, 7, -82, 99, 7, -16, 85, 127, 126, -50, -79, 85, -6, 25, 70, 72, 78, -71, -19, 11, 8,
				-63, 27, 32, -76, -19, 85, -124, -119, -66, -51, -27, 54, 56, -17, -19, -64, -21, -82, 127, 22, 48,
				-125, 112, 117, 92, -32, -65, 124, 42, 77, 53, 29, -23, -22, -18, -100, -109, 89, -89, 36, 79, -125,
				-43, -54, 88, 72, -94, 114, 107, 123, 83, -10, -87, -120, -46, -2, 68, -108, -20, 79, 36, -55, 8, 86,
				96, -36, -23, -97, -35, 100, -78, 109, -67, 3, -119, 35, 49, -93, 38, 16, 18, -95, 76, 37, 7, -15, 34,
				-80, -63, -37, -49, 89, 15, 82, 111, -116, 79, 30, -104, 67, 30, -116, 113, -124, -22, 126, 13, -40,
				12, -20, 38, -76, -104, 67, -64, 105, 51, 59, 47, -23, 1, -32, -21, -124, -64, 77, 98, 40, 59, -69,
				-128, 1, 111, 103, -85, -127, 7, -127, -9, 17, 38, -31, -78, 67, -13, -18, -28, 18, 112, -97, -53, -36,
				-32, -8, 83, -64, 68, 51, -21, -105, -12, 69, -32, 75, -124, 100, 42, 87, 125, 47, -31, -18, 60, 5,
				-32, 45, 112, 27, 33, 17, 4, -84, -13, -18, -46, 35, -23, 73, -9, -57, 36, 66, 85, -31, 24, 79, -70,
				125, -113, 19, -110, -93, -4, 126, 93, 75, -88, -74, 22, -122, 42, 118, 18, -16, 14, -95, -99, 62, -31,
				-2, 105, 35, 84, -9, 96, 87, 48, -128, -67, -112, -82, 111, -54, -82, -111, -79, -42, 108, -16, 30,
				-23, 3, 21, -64, 34, -125, 106, 5, -59, -26, -62, -81, 112, -79, -72, -84, -79, -93, -29, -28, 96, 36,
				-92, -55, -124, -20, 43, 83, -28, -114, 42, -60, 70, -25, 26, 55, -24, -92, -103, -107, -37, -80, 57,
				-40, -118, 24, -80, 18, -48, 107, 102, 5, -25, 73, 17, -38, -54, 121, 51, -69, -32, 107, -43, -18, -36,
				36, -61, -37, -28, 9, 51, 43, 57, 79, -102, -112, 20, 101, 92, -89, -4, 124, 115, 12, -110, 84, 73,
				-72, -93, -54, 119, 119, -113, -103, -99, -115, -99, 81, -19, -14, 5, 15, 98, 29, 112, 97, 4, -74, 41,
				-128, -54, -81, 26, 49, -69, -58, 19, 18, 38, -114, 79, -114, 49, -14, 22, 93, -58, 87, 34, 12, -128,
				-109, 99, -4, 34, 84, 109, -63, -52, -118, -50, 63, 5, 40, -102, -39, -32, 16, 58, -88, -68, -77, -95,
				-95, -90, 84, 83, -79, 6, -29, 94, 19, -11, -31, 115, -37, 112, 50, 56, -121, -12, 10, 42, 62, 48, -29,
				72, 103, -5, -56, -3, 49, -70, 58, 52, -20, 107, -63, -85, -112, -54, -51, -53, 46, 72, -108, 116, -89,
				-52, -106, 10, 53, 25, -106, 66, 116, -119, -24, 15, 9, 75, 60, -97, 62, 83, -40, 115, 109, 119, 119,
				-31, 106, 1, 30, -93, -1, -92, 127, 3, 51, -103, 55, 114, -48, -104, 104, -113, 0, 0, 0, 0, 73, 69, 78,
				68, -82, 66, 96, -126 };
		return buffer;
	}
	
	public static Drawable getDrawable() {
		return ByteArrayDrawable.bytesToDrawable(getBytes());
	}


}
