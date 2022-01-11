/* SPDX-License-Identifier: MIT */
/* LWJGL: Manually created. This file is normally generated by configure. */
#ifndef LIBURING_COMPAT_H
#define LIBURING_COMPAT_H

#include <inttypes.h>
#include <stdint.h>
#include <sys/stat.h>

typedef int __kernel_rwf_t;

struct __kernel_timespec {
	int64_t		tv_sec;
	long long	tv_nsec;
};

struct open_how {
	uint64_t	flags;
	uint64_t	mode;
	uint64_t	resolve;
};

#endif