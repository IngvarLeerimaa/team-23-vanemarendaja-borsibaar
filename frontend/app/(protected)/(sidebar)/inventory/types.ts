export interface InventoryItemDto {
  id: number;
  productId: number;
  productName: string;

  // string | number ?
  basePrice: number | string;
  minPrice: number | string;
  maxPrice: number | string;

  quantity: number | string;
  updatedAt: string; // ISO date string
}

export interface CategoryDto {
  id: number;
  name: string;
  dynamicPricing: boolean;
}

export interface InventoryTransactionResponseDto {
  id: number;
  inventoryId: number;
  transactionType: string;
  quantityChange: number;
  quantityBefore: number;
  quantityAfter: number;
  referenceId?: string;
  notes?: string;
  createdBy: string;
  createdByName?: string;
  createdByEmail?: string;
  createdAt: string;
}
