/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describe the power state of a display.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code powerState} <b>must</b> be a valid {@code VkDisplayPowerStateEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDisplayControl#vkDisplayPowerControlEXT DisplayPowerControlEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code powerState} &ndash; a {@code VkDisplayPowerStateEXT} value specifying the new power state of the display.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDisplayPowerInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDisplayPowerStateEXT powerState;
 * }</pre></code>
 */
public class VkDisplayPowerInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        POWERSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        POWERSTATE = layout.offsetof(2);
    }

    VkDisplayPowerInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDisplayPowerInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPowerInfoEXT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code powerState} field. */
    @NativeType("VkDisplayPowerStateEXT")
    public int powerState() { return npowerState(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplayPowerInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplayPowerInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code powerState} field. */
    public VkDisplayPowerInfoEXT powerState(@NativeType("VkDisplayPowerStateEXT") int value) { npowerState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayPowerInfoEXT set(
        int sType,
        long pNext,
        int powerState
    ) {
        sType(sType);
        pNext(pNext);
        powerState(powerState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayPowerInfoEXT set(VkDisplayPowerInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDisplayPowerInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPowerInfoEXT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDisplayPowerInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPowerInfoEXT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDisplayPowerInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPowerInfoEXT create() {
        return new VkDisplayPowerInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDisplayPowerInfoEXT} instance for the specified memory address. */
    public static VkDisplayPowerInfoEXT create(long address) {
        return new VkDisplayPowerInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPowerInfoEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDisplayPowerInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPowerInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDisplayPowerInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplayPowerInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDisplayPowerInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplayPowerInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPowerInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPowerInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplayPowerInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayPowerInfoEXT.PNEXT); }
    /** Unsafe version of {@link #powerState}. */
    public static int npowerState(long struct) { return memGetInt(struct + VkDisplayPowerInfoEXT.POWERSTATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayPowerInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayPowerInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #powerState(int) powerState}. */
    public static void npowerState(long struct, int value) { memPutInt(struct + VkDisplayPowerInfoEXT.POWERSTATE, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayPowerInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPowerInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDisplayPowerInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPowerInfoEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkDisplayPowerInfoEXT newInstance(long address) {
            return new VkDisplayPowerInfoEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayPowerInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayPowerInfoEXT.npNext(address()); }
        /** Returns the value of the {@code powerState} field. */
        @NativeType("VkDisplayPowerStateEXT")
        public int powerState() { return VkDisplayPowerInfoEXT.npowerState(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplayPowerInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayPowerInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplayPowerInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDisplayPowerInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code powerState} field. */
        public VkDisplayPowerInfoEXT.Buffer powerState(@NativeType("VkDisplayPowerStateEXT") int value) { VkDisplayPowerInfoEXT.npowerState(address(), value); return this; }

    }

}